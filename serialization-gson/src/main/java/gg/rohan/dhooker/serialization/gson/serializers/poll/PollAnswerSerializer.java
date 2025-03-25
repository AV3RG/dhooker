package gg.rohan.dhooker.serialization.gson.serializers.poll;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.poll.PollAnswer;

import java.lang.reflect.Type;

public class PollAnswerSerializer implements JsonSerializer<PollAnswer> {

    @Override
    public JsonElement serialize(PollAnswer pollAnswer, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.add("poll_media", context.serialize(pollAnswer.getContent()));
        return base;
    }

}
