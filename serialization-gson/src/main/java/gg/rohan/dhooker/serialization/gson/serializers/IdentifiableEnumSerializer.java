package gg.rohan.dhooker.serialization.gson.serializers;

import com.google.gson.*;
import gg.rohan.dhooker.serialization.IdentifiedEnum;

import java.lang.reflect.Type;

public class IdentifiableEnumSerializer<T> implements JsonSerializer<IdentifiedEnum<T>> {

    @Override
    public JsonElement serialize(IdentifiedEnum<T> identifiedEnum, Type type, JsonSerializationContext context) {
        T value = identifiedEnum.getIdentifier();
        if (value instanceof Boolean) {
            return new JsonPrimitive((Boolean) value);
        } else if (value instanceof Number) {
            return new JsonPrimitive((Number) value);
        } else if (value instanceof String) {
            return new JsonPrimitive((String) value);
        } else if (value instanceof Character) {
            return new JsonPrimitive((Character) value);
        } else {
            return context.serialize(value);
        }
    }

}
