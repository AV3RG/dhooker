package gg.rohan.dhooker.serialization.gson.serializers.poll;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.poll.PollMedia;
import gg.rohan.dhooker.serialization.gson.util.JsonUtils;

import java.lang.reflect.Type;

public class PollMediaSerializer implements JsonSerializer<PollMedia> {

    @Override
    public JsonElement serialize(PollMedia pollMedia, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.addProperty("text", pollMedia.getText());
        JsonUtils.addOptionally(base, "emoji", pollMedia.getEmoji(), context);
        return base;
    }

}
