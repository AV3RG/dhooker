package gg.rohan.dhooker.client;

import gg.rohan.dhooker.client.response.MessageResponse;

public interface HttpClient {

    MessageResponse send(MessageRequest request);

}
