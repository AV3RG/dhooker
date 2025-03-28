package gg.rohan.dhooker.serialization.gson.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.source.SourceRepresent;

import java.lang.reflect.Type;

public class SourceRepresentSerializer implements JsonSerializer<SourceRepresent> {

    @Override
    public JsonElement serialize(SourceRepresent sourceRepresent, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(sourceRepresent.representedValue());
    }

}
