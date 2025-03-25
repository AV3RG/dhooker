package gg.rohan.dhooker.serialization.gson.serializers.component.button;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.component.button.PremiumButton;
import gg.rohan.dhooker.object.util.TriState;

import java.lang.reflect.Type;

public class PremiumButtonSerializer implements JsonSerializer<PremiumButton> {

    @Override
    public JsonElement serialize(PremiumButton button, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.add("type", context.serialize(button.getType()));
        base.add("style", context.serialize(button.getStyle()));
        base.addProperty("sku_id", button.getSkuId());
        if (TriState.isExplicitSet(button.getDisabled())) {
            base.addProperty("disabled", button.getDisabled().toBoolean());
        }
        return base;
    }
}

