package gg.rohan.dhooker.serialization.gson.serializers.embed;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.embed.EmbedField;

import java.lang.reflect.Type;

public class EmbedFieldSerializer implements JsonSerializer<EmbedField> {

    @Override
    public JsonElement serialize(EmbedField embedField, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject base = new JsonObject();
        base.addProperty("name", embedField.getName());
        base.addProperty("value", embedField.getValue());
        base.addProperty("inline", embedField.isInline());
        return base;
    }

}
