package gg.rohan.dhooker.client;

import gg.rohan.dhooker.client.response.MessageResponse;
import gg.rohan.dhooker.object.Message;
import gg.rohan.dhooker.object.snowflake.Snowflake;
import gg.rohan.dhooker.object.util.TriState;
import gg.rohan.dhooker.serialization.WebhookSerializer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;

public class Webhook {

    private final Snowflake webhookId;
    private final String token;
    private final WebhookDefaults defaults;
    private final ScheduledExecutorService executor;
    private final RateLimitHandler rateLimitHandler;
    private final HttpClient httpClient;
    private final WebhookSerializer webhookSerializer;
    private final QueueHandler queueHandler;

    private final BlockingDeque<MessageRequest> messageQueue;

    public Webhook(
            Snowflake webhookId,
            String token,
            WebhookDefaults defaults,
            ScheduledExecutorService executor,
            RateLimitHandler rateLimitHandler,
            HttpClientCreator<?> httpClientCreator,
            WebhookSerializer webhookSerializer
    ) {
        this.webhookId = webhookId;
        this.token = token;
        this.defaults = defaults;
        this.executor = executor;
        this.rateLimitHandler = rateLimitHandler;
        this.httpClient = httpClientCreator.createForWebhook(this);
        this.webhookSerializer = webhookSerializer;

        this.messageQueue = new LinkedBlockingDeque<>();
        this.queueHandler = new QueueHandler(this);
    }

    public void queueMessage(Message message) {
        this.queueMessage(
                message,
                this.defaults.getDefaultWaitForResponse(),
                this.defaults.getDefaultThread(),
                this.defaults.getDefaultWithComponents(),
                this.defaults.getDefaultCallback()
        );
    }

    public void queueMessage(Message message, Consumer<MessageResponse> callback) {
        this.queueMessage(
                message,
                this.defaults.getDefaultWaitForResponse(),
                this.defaults.getDefaultThread(),
                this.defaults.getDefaultWithComponents(),
                callback
        );
    }

    public void queueMessage(Message message, TriState waitForResponse, Snowflake thread, TriState withComponents, Consumer<MessageResponse> callback) {
        this.queueRequest(new MessageRequest(this.webhookId, this.token, message, waitForResponse, thread, withComponents, callback));
    }

    private void queueRequest(MessageRequest messageRequest) {
        this.messageQueue.push(messageRequest);
        this.queueHandler.onQueue();
    }

    public WebhookSerializer getWebhookSerializer() {
        return this.webhookSerializer;
    }

    protected RateLimitHandler getRateLimitHandler() {
        return this.rateLimitHandler;
    }

    protected ScheduledExecutorService getExecutor() {
        return this.executor;
    }

    protected BlockingDeque<MessageRequest> getMessageQueue() {
        return this.messageQueue;
    }

    protected HttpClient getHttpClient() {
        return this.httpClient;
    }

    protected WebhookDefaults getDefaults() {
        return this.defaults;
    }

}
