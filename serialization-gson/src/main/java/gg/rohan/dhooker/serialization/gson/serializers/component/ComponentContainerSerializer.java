package gg.rohan.dhooker.serialization.gson.serializers.component;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.component.ComponentContainer;

import java.lang.reflect.Type;

public class ComponentContainerSerializer implements JsonSerializer<ComponentContainer> {

    @Override
    public JsonElement serialize(ComponentContainer container, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.add("type", context.serialize(container.getType()));
        base.add("components", context.serialize(container.getChildren()));
        return base;
    }

}
