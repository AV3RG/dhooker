package gg.rohan.dhooker.client.response;

import java.util.List;
import java.util.Map;

public class FailureResponse extends CallbackResponse {

    public FailureResponse(int code, Map<String, List<String>> headers, String responseBody) {
        super(code, headers, responseBody);
    }

}
