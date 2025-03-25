package gg.rohan.dhooker.serialization.gson.serializers.component.select;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.component.select.SelectDefaultValue;

import java.lang.reflect.Type;

public class SelectDefaultValueSerializer implements JsonSerializer<SelectDefaultValue> {

    @Override
    public JsonElement serialize(SelectDefaultValue defaultValue, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.add("id", context.serialize(defaultValue.getId()));
        base.add("type", context.serialize(defaultValue.getType()));
        return base;
    }

}
