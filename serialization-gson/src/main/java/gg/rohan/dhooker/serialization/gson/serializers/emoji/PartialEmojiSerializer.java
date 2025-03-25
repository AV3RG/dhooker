package gg.rohan.dhooker.serialization.gson.serializers.emoji;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

import java.lang.reflect.Type;

public class PartialEmojiSerializer implements JsonSerializer<PartialEmoji> {

    @Override
    public JsonElement serialize(PartialEmoji partialEmoji, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.add("id", context.serialize(partialEmoji.getId()));
        base.addProperty("name", partialEmoji.getName());
        if (TriState.isExplicitSet(partialEmoji.getAnimated())) {
            base.addProperty("animated", partialEmoji.getAnimated().toBoolean());
        }
        return base;
    }

}
