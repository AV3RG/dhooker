package gg.rohan.dhooker.client;

import gg.rohan.dhooker.client.response.MessageResponse;
import gg.rohan.dhooker.object.Message;
import gg.rohan.dhooker.object.snowflake.Snowflake;
import gg.rohan.dhooker.object.util.TriState;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MessageRequest {

    private static final String WEBHOOK_URL_FORMAT = "https://discord.com/api/v%1$s/webhooks/%2$s/%3$s";

    private final Snowflake webhookId;
    private final String token;
    private final Message message;
    private final TriState wait;
    private final Snowflake threadId;
    private final TriState withComponents;
    private final Consumer<MessageResponse> callback;
    private boolean complete;

    public MessageRequest(
            Snowflake webhookId,
            String token,
            Message message,
            TriState wait,
            Snowflake threadId,
            TriState withComponents,
            Consumer<MessageResponse> callback
    ) {
        this.webhookId = webhookId;
        this.token = token;
        this.message = message;
        this.wait = wait;
        this.threadId = threadId;
        this.withComponents = withComponents;
        this.callback = callback;
        this.complete = false;
    }

    public Message getMessage() {
        return this.message;
    }

    public TriState getWait() {
        return this.wait;
    }

    public Snowflake getThreadId() {
        return this.threadId;
    }

    public TriState getWithComponents() {
        return this.withComponents;
    }

    public void complete(MessageResponse response) {
        if (this.complete) {
            throw new IllegalStateException("Request already completed");
        }
        this.complete = true;
        this.callback.accept(response);
    }

    public String processUrl() {
        Map<String, String> queries = new HashMap<>();
        if (TriState.isExplicitSet(this.wait)) {
            queries.put("wait", Boolean.toString(this.wait.toBoolean()));
        }
        if (TriState.isExplicitSet(this.withComponents)) {
            queries.put("with_components", Boolean.toString(this.withComponents.toBoolean()));
        }
        if (this.threadId != null) {
            queries.put("thread_id", this.threadId.toString());
        }
        String url = String.format(WEBHOOK_URL_FORMAT, WebhookConstants.API_VERSION, this.webhookId, this.token);
        return this.attachQueryParamsString(url, queries);
    }

    private String attachQueryParamsString(String url, Map<String, String> params) {
        if (params.isEmpty()) return url;
        return url + "?" + params
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining("&"));
    }

}
