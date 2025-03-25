package gg.rohan.dhooker.serialization.gson.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.snowflake.Snowflake;

import java.lang.reflect.Type;

public class SnowflakeSerializer implements JsonSerializer<Snowflake> {

    @Override
    public JsonElement serialize(Snowflake snowflake, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(snowflake.toString());
    }

}
