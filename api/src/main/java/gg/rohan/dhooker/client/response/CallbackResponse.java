package gg.rohan.dhooker.client.response;

import java.util.List;
import java.util.Map;

public abstract class CallbackResponse extends MessageResponse {

    private final int code;
    private final Map<String, List<String>> headers;
    private final String body;

    protected CallbackResponse(int code, Map<String, List<String>> headers, String responseBody) {
        this.code = code;
        this.headers = headers;
        this.body = responseBody;
    }

    public int getCode() {
        return this.code;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public String getBody() {
        return this.body;
    }

}
