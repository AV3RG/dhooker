package gg.rohan.dhooker.client;

import gg.rohan.dhooker.client.response.CallbackResponse;
import gg.rohan.dhooker.client.response.MessageResponse;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class QueueHandler {

    private final Webhook webhook;
    private boolean state;

    public QueueHandler(Webhook webhook) {
        this.webhook = webhook;
    }

    public void onQueue() {
        if (state) return;
        state = true;
        Duration timeTillReset = this.webhook.getRateLimitHandler().timeTillReset();
        if (timeTillReset.isNegative()) {
            timeTillReset = Duration.ZERO;
        }
        this.webhook.getExecutor().schedule(this::processQueue, timeTillReset.toMillis(), TimeUnit.MILLISECONDS);
    }

    public void processQueue() {
        while (!this.webhook.getMessageQueue().isEmpty()) {
            MessageRequest request = this.webhook.getMessageQueue().poll();
            MessageResponse response = this.webhook.getHttpClient().send(request);
            if (response.isException()) {
                this.pauseOnError();
            } else {
                this.webhook.getRateLimitHandler().onResponse((CallbackResponse) response);
            }
        }
        state = false;
    }

    public void pauseOnError() {
        this.state = false;
        Duration waitTimeAfterIOError = this.webhook.getDefaults().getWaitTimeAfterIOError();
        this.webhook.getExecutor().schedule(this::onQueue, waitTimeAfterIOError.toMillis(), TimeUnit.MILLISECONDS);
    }

}
