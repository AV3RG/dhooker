package gg.rohan.dhooker.client;

import gg.rohan.dhooker.client.response.CallbackResponse;

import java.time.Duration;

public interface RateLimitHandler {

    boolean hasHitRateLimit();

    Duration timeTillReset();

    void onResponse(CallbackResponse response);

}
