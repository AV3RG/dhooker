package gg.rohan.dhooker.client.okhttp;

import gg.rohan.dhooker.client.HttpClient;
import gg.rohan.dhooker.client.MessageRequest;
import gg.rohan.dhooker.client.Webhook;
import gg.rohan.dhooker.client.WebhookConstants;
import gg.rohan.dhooker.client.response.ExceptionResponse;
import gg.rohan.dhooker.client.response.MessageResponse;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class OkHttpWebhookClient implements HttpClient {

    private final OkHttpClient client;
    private final Webhook webhook;

    public OkHttpWebhookClient(Webhook webhook) {
        this.client = new OkHttpClient();
        this.webhook = webhook;
    }

    @Override
    public MessageResponse send(MessageRequest request) {
        String finalEndpoint = request.processUrl();
        Call call = this.client.newCall(
                new Request.Builder()
                        .url(finalEndpoint)
                        .method("POST", ConversionUtils.toRequestBody(request, this.webhook.getWebhookSerializer()))
                        .addHeader("User-Agent", WebhookConstants.USER_AGENT)
                        .build()
        );
        try (Response response = call.execute()) {

            return ConversionUtils.toCallbackResponse(response);
        } catch (IOException e) {
            return new ExceptionResponse(e);
        }
    }

}
