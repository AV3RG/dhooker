package gg.rohan.dhooker.serialization.gson.serializers.embed;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.embed.EmbedThumbnail;

import java.lang.reflect.Type;

public class EmbedThumbnailSerializer implements JsonSerializer<EmbedThumbnail> {

    @Override
    public JsonElement serialize(EmbedThumbnail embedThumbnail, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(embedThumbnail.getUrl().representedValue());
    }

}
