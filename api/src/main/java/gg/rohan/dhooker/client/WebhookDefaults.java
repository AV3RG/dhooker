package gg.rohan.dhooker.client;

import gg.rohan.dhooker.client.response.MessageResponse;
import gg.rohan.dhooker.object.snowflake.Snowflake;
import gg.rohan.dhooker.object.util.TriState;

import java.time.Duration;
import java.util.function.Consumer;

public class WebhookDefaults {

    private final TriState defaultWaitForResponse;
    private final TriState defaultWithComponents;
    private final Snowflake defaultThread;
    private final Consumer<MessageResponse> defaultCallback;
    private final Duration waitTimeAfterIOError;

    public WebhookDefaults(
            TriState defaultWaitForResponse,
            TriState defaultWithComponents,
            Snowflake defaultThread,
            Consumer<MessageResponse> defaultCallback,
            Duration waitTimeAfterIOError
    ) {
        this.defaultWaitForResponse = defaultWaitForResponse;
        this.defaultWithComponents = defaultWithComponents;
        this.defaultThread = defaultThread;
        this.defaultCallback = defaultCallback;
        this.waitTimeAfterIOError = waitTimeAfterIOError;
    }

    public TriState getDefaultWaitForResponse() {
        return this.defaultWaitForResponse;
    }

    public TriState getDefaultWithComponents() {
        return this.defaultWithComponents;
    }

    public Snowflake getDefaultThread() {
        return this.defaultThread;
    }

    public Consumer<MessageResponse> getDefaultCallback() {
        return this.defaultCallback;
    }

    public Duration getWaitTimeAfterIOError() {
        return this.waitTimeAfterIOError;
    }

}
