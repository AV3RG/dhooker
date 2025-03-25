package gg.rohan.dhooker.serialization.gson.serializers.poll;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.poll.Poll;
import gg.rohan.dhooker.object.util.TriState;
import gg.rohan.dhooker.serialization.gson.util.JsonUtils;

import java.lang.reflect.Type;

public class PollSerializer implements JsonSerializer<Poll> {

    @Override
    public JsonElement serialize(Poll poll, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.add("question", context.serialize(poll.getQuestion()));
        base.add("answers", context.serialize(poll.getPollAnswers()));
        JsonUtils.addOptionally(base, "duration", poll.getHoursOpen());
        if (TriState.isExplicitSet(poll.getAllowMultiSelect())) {
            base.addProperty("allow_multiselect", poll.getAllowMultiSelect().toBoolean());
        }
        JsonUtils.addOptionally(base, "layout_type", poll.getLayoutType(), context);
        return base;
    }
}
