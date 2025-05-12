package gg.rohan.dhooker.serialization.gson.serializers.component.button;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.component.button.LinkButton;
import gg.rohan.dhooker.object.util.TriState;

import java.lang.reflect.Type;

public class LinkButtonSerializer implements JsonSerializer<LinkButton> {

    @Override
    public JsonElement serialize(LinkButton button, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.add("type", context.serialize(button.getType()));
        base.add("style", context.serialize(button.getStyle()));
        base.addProperty("label", button.getLabel());
        base.add("emoji", context.serialize(button.getEmoji()));
        base.addProperty("url", button.getUrl());
        if (TriState.isExplicitSet(button.getDisabled())) {
            base.addProperty("disabled", button.getDisabled().toBoolean());
        }
        return base;
    }

}
