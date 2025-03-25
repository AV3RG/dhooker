package gg.rohan.dhooker.client.response;

import java.util.List;
import java.util.Map;

public class MessageSuccessfulResponse extends SuccessfulResponse {

    public MessageSuccessfulResponse(int code, Map<String, List<String>> headers, String responseBody) {
        super(code, headers, responseBody);
    }

}
