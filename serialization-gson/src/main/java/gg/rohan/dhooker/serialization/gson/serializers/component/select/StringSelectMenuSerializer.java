package gg.rohan.dhooker.serialization.gson.serializers.component.select;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.component.select.StringSelectMenu;
import gg.rohan.dhooker.object.util.TriState;
import gg.rohan.dhooker.serialization.gson.util.JsonUtils;

import java.lang.reflect.Type;

public class StringSelectMenuSerializer implements JsonSerializer<StringSelectMenu> {

    @Override
    public JsonElement serialize(StringSelectMenu selectMenu, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        base.add("type", context.serialize(selectMenu.getType()));
        base.addProperty("custom_id", selectMenu.getCustomId());
        base.add("options", context.serialize(selectMenu.getOptions()));
        JsonUtils.addOptionally(base, "placeholder", selectMenu.getPlaceholder());
        JsonUtils.addOptionally(base, "min_values", selectMenu.getMinRequired());
        JsonUtils.addOptionally(base, "max_values", selectMenu.getMaxRequired());
        if (TriState.isExplicitSet(selectMenu.getDisabled())) {
            base.addProperty("disabled", selectMenu.getDisabled().toBoolean());
        }
        return base;
    }

}
