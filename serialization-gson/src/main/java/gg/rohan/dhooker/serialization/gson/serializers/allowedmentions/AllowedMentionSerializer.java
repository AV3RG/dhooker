package gg.rohan.dhooker.serialization.gson.serializers.allowedmentions;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.allowedmentions.AllowedMentions;
import gg.rohan.dhooker.serialization.gson.util.JsonUtils;

import java.lang.reflect.Type;

public class AllowedMentionSerializer implements JsonSerializer<AllowedMentions> {

    @Override
    public JsonElement serialize(AllowedMentions allowedMentions, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        JsonUtils.addOptionally(base, "parse", allowedMentions.getAllowedTypes(), context);
        JsonUtils.addOptionally(base, "roles", allowedMentions.getRoles(), context);
        JsonUtils.addOptionally(base, "users", allowedMentions.getUsers(), context);
        JsonUtils.addOptionally(base, "replied_user", allowedMentions.isRepliedUser());
        return base;
    }

}
