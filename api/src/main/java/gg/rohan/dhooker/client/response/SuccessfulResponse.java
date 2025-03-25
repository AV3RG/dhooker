package gg.rohan.dhooker.client.response;

import java.util.List;
import java.util.Map;

public abstract class SuccessfulResponse extends CallbackResponse {

    public SuccessfulResponse(int code, Map<String, List<String>> headers, String responseBody) {
        super(code, headers, responseBody);
    }

}
