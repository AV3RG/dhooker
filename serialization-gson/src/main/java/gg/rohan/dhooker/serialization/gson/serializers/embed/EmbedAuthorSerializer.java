package gg.rohan.dhooker.serialization.gson.serializers.embed;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.embed.EmbedAuthor;

import java.lang.reflect.Type;

public class EmbedAuthorSerializer implements JsonSerializer<EmbedAuthor> {

    @Override
    public JsonElement serialize(EmbedAuthor author, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.addProperty("name", author.getName());
        base.addProperty("url", author.getAuthorUrl());
        base.add("icon_url", context.serialize(author.getIconUrl()));
        return base;
    }

}
