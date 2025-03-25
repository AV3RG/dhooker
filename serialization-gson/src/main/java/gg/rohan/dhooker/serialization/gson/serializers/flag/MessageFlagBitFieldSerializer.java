package gg.rohan.dhooker.serialization.gson.serializers.flag;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.flag.MessageFlagBitField;

import java.lang.reflect.Type;

public class MessageFlagBitFieldSerializer implements JsonSerializer<MessageFlagBitField> {

    @Override
    public JsonElement serialize(MessageFlagBitField messageFlagBitField, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(messageFlagBitField.getBitField());
    }

}
