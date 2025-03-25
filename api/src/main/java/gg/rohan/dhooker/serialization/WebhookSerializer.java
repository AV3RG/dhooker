package gg.rohan.dhooker.serialization;

import gg.rohan.dhooker.object.Message;

public interface WebhookSerializer {

    String serialize(Message message);

}
