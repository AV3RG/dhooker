package gg.rohan.dhooker.serialization.gson.serializers.embed;

import com.google.gson.*;
import gg.rohan.dhooker.object.embed.EmbedThumbnail;

import java.lang.reflect.Type;

public class EmbedThumbnailSerializer implements JsonSerializer<EmbedThumbnail> {

    @Override
    public JsonElement serialize(EmbedThumbnail embedThumbnail, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.add("url", context.serialize(embedThumbnail.getUrl()));
        return base;
    }

}
