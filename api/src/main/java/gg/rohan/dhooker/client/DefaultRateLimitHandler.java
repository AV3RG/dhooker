package gg.rohan.dhooker.client;

import gg.rohan.dhooker.client.response.CallbackResponse;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;

public class DefaultRateLimitHandler implements RateLimitHandler {

    private Instant resetTime;
    private int remainingUses;
    private int limit = Integer.MAX_VALUE;

    @Override
    public synchronized boolean hasHitRateLimit() {
        if (timeTillReset().isNegative()) {
            remainingUses = limit;
        }
        return remainingUses <= 0;
    }

    @Override
    public synchronized Duration timeTillReset() {
        if (resetTime == null || resetTime.isBefore(Instant.now())) {
            return Duration.ZERO;
        }
        return Duration.between(resetTime, Instant.now());
    }

    private synchronized void onRateLimit(Map<String, List<String>> headers) {
        this.resetTime = Instant.ofEpochMilli(Double.doubleToLongBits(Double.parseDouble(headers.get("x-ratelimit-reset").get(0))));
        this.remainingUses = 0;
        this.updateLimit(headers);
    }

    private synchronized void onNormalResponse(Map<String, List<String>> headers) {
        this.resetTime = Instant.ofEpochMilli(Double.doubleToLongBits(Double.parseDouble(headers.get("x-ratelimit-reset").get(0))));
        this.remainingUses = Integer.parseInt(headers.get("x-ratelimit-remaining").get(0));
        this.updateLimit(headers);
    }

    private synchronized void updateLimit(Map<String, List<String>> headers) {
        this.limit = Integer.parseInt(headers.get("x-ratelimit-limit").get(0));
    }

    @Override
    public synchronized void onResponse(CallbackResponse response) {
        Map<String, List<String>> headers = response.getHeaders();
        if (response.getCode() == 429) onRateLimit(headers);
        else onNormalResponse(headers);
    }

}
