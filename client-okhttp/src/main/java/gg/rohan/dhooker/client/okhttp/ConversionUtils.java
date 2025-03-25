package gg.rohan.dhooker.client.okhttp;

import gg.rohan.dhooker.client.MessageRequest;
import gg.rohan.dhooker.client.response.*;
import gg.rohan.dhooker.object.Message;
import gg.rohan.dhooker.object.attachment.PartialAttachment;
import gg.rohan.dhooker.serialization.WebhookSerializer;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ConversionUtils {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final MediaType OCTET = MediaType.parse("application/octet-stream");

    public static RequestBody toRequestBody(MessageRequest request, WebhookSerializer serializer) {
        Message message = request.getMessage();
        String payload = serializer.serialize(message);
        if (message.getAttachments() == null || message.getAttachments().isEmpty()) {
            return RequestBody.create(payload, JSON);
        } else {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            builder.addFormDataPart("payload_json", payload);
            for (int i = 0; i < message.getAttachments().size(); i++) {
                PartialAttachment attachment = message.getAttachments().get(i);
                builder.addFormDataPart(
                        "files[" + i + "]",
                        attachment.getSourceRepresent().getFileName(),
                        RequestBody.create(attachment.getFileContents(), OCTET)
                );
            }
            return builder.setType(MultipartBody.FORM).build();
        }
    }

    //TODO: Complete Response handling functionality and classes
    public static CallbackResponse toCallbackResponse(Response response) {
        int code = response.code();
        Map<String, List<String>> headers = response.headers().toMultimap();
        try {
            //TODO FIX try catch
            if (response.isSuccessful()) {
                if (response.code() == 204) {
                    return new EmptySuccessfulResponse(code, headers, "body");
                } else {
                    return new MessageSuccessfulResponse(code, headers, "body");
                }
            } else {
                return new FailureResponse(code, headers, "body");
            }
        } catch (Exception e) {
            return null;
        }

    }

}
