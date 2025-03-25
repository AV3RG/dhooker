package gg.rohan.dhooker.client.response;

public abstract class MessageResponse {

    protected MessageResponse() {}

    public boolean isException() {
        return this instanceof ExceptionResponse;
    }

    public boolean isSuccess() {
        return this instanceof SuccessfulResponse;
    }

}
