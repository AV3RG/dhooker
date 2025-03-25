package gg.rohan.dhooker.serialization.gson.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.Message;
import gg.rohan.dhooker.object.util.TriState;
import gg.rohan.dhooker.serialization.gson.util.JsonUtils;

import java.lang.reflect.Type;

public class MessageSerializer implements JsonSerializer<Message> {

    @Override
    public JsonElement serialize(Message message, Type type, JsonSerializationContext context) {
        JsonObject base = new JsonObject();
        JsonUtils.addOptionally(base, "content", message.getContent());
        JsonUtils.addOptionally(base, "username", message.getUsername());
        JsonUtils.addOptionally(base, "avatar_url", message.getAvatarUrl());
        if (TriState.isExplicitSet(message.isTts())) {
            base.addProperty("tts", message.isTts().toBoolean());
        }
        JsonUtils.addOptionally(base, "embeds", message.getEmbeds(), context);
        JsonUtils.addOptionally(base, "allowed_mentions", message.getAllowedMentions(), context);
        JsonUtils.addOptionally(base, "components", message.getComponents(), context);
        JsonUtils.addOptionally(base, "flags", message.getMessageFlagBitField(), context);
        JsonUtils.addOptionally(base, "thread_name", message.getThreadName());
        JsonUtils.addOptionally(base, "applied_tags", message.getAppliedTags(), context);
        JsonUtils.addOptionally(base, "poll", message.getPoll(), context);
        return base;
    }
}
