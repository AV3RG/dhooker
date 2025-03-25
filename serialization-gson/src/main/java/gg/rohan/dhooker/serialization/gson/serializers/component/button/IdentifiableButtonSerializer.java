package gg.rohan.dhooker.serialization.gson.serializers.component.button;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.component.button.IdentifiableButton;
import gg.rohan.dhooker.object.util.TriState;
import gg.rohan.dhooker.serialization.gson.util.JsonUtils;

import java.lang.reflect.Type;

public class IdentifiableButtonSerializer implements JsonSerializer<IdentifiableButton> {

    @Override
    public JsonElement serialize(IdentifiableButton button, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.add("type", context.serialize(button.getType()));
        base.add("style", context.serialize(button.getStyle()));
        JsonUtils.addOptionally(base, "label", button.getLabel());
        JsonUtils.addOptionally(base, "emoji", button.getEmoji(), context);
        base.addProperty("custom_id", button.getCustomId());
        if (TriState.isExplicitSet(button.getDisabled())) {
            base.addProperty("disabled", button.getDisabled().toBoolean());
        }
        return base;
    }

}
