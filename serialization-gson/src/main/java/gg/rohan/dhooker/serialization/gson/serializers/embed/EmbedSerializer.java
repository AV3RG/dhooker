package gg.rohan.dhooker.serialization.gson.serializers.embed;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.embed.Embed;
import gg.rohan.dhooker.serialization.gson.util.JsonUtils;

import java.lang.reflect.Type;

public class EmbedSerializer implements JsonSerializer<Embed> {

    @Override
    public JsonElement serialize(Embed embed, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        JsonUtils.addOptionally(base, "title", embed.getTitle());
        JsonUtils.addOptionally(base, "type", embed.getEmbedType(), context);
        JsonUtils.addOptionally(base, "description", embed.getDescription());
        JsonUtils.addOptionally(base, "url", embed.getUrl());
        JsonUtils.addOptionally(base, "timestamp", embed.getTimestamp(), context);
        JsonUtils.addOptionally(base, "color", embed.getColor(), context);
        JsonUtils.addOptionally(base, "footer", embed.getFooter(), context);
        JsonUtils.addOptionally(base, "image", embed.getImage(), context);
        JsonUtils.addOptionally(base, "thumbnail", embed.getThumbnail(), context);
        JsonUtils.addOptionally(base, "author", embed.getAuthor(), context);
        JsonUtils.addOptionally(base, "fields", embed.getFields(), context);
        return base;
    }

}
