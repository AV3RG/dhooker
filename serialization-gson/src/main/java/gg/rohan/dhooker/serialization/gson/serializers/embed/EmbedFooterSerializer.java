package gg.rohan.dhooker.serialization.gson.serializers.embed;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.embed.EmbedFooter;

import java.lang.reflect.Type;

public class EmbedFooterSerializer implements JsonSerializer<EmbedFooter> {

    @Override
    public JsonElement serialize(EmbedFooter embedFooter, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.addProperty("text", embedFooter.getText());
        base.add("icon_url", context.serialize(embedFooter.getIconUrl()));
        return base;
    }

}
