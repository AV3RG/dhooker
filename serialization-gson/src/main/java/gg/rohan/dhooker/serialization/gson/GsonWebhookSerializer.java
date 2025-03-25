package gg.rohan.dhooker.serialization.gson;

import gg.rohan.dhooker.object.Message;
import gg.rohan.dhooker.serialization.WebhookSerializer;

public class GsonWebhookSerializer implements WebhookSerializer {

    @Override
    public String serialize(Message message) {
        return GsonInstance.getInstance().toJson(message);
    }

}
