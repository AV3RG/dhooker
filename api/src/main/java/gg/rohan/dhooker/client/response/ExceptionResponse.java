package gg.rohan.dhooker.client.response;

import java.io.IOException;

public class ExceptionResponse extends MessageResponse {

    private final IOException exception;

    public ExceptionResponse(IOException exception) {
        this.exception = exception;
    }

    public IOException getException() {
        return this.exception;
    }

}
