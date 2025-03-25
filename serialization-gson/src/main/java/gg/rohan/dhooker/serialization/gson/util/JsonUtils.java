package gg.rohan.dhooker.serialization.gson.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.util.List;

public class JsonUtils {

    public static void addOptionally(JsonObject json, String key, JsonElement value) {
        if (value != null) {
            json.add(key, value);
        }
    }

    public static void addOptionally(JsonObject json, String key, String value) {
        if (value != null) {
            json.addProperty(key, value);
        }
    }

    public static void addOptionally(JsonObject json, String key, Number value) {
        if (value != null) {
            json.addProperty(key, value);
        }
    }

    public static void addOptionally(JsonObject json, String key, Boolean value) {
        if (value != null) {
            json.addProperty(key, value);
        }
    }

    public static void addOptionally(JsonObject json, String key, Character value) {
        if (value != null) {
            json.addProperty(key, value);
        }
    }

    public static void addOptionally(JsonObject json, String key, List<?> value, JsonSerializationContext context) {
        if (value != null) {
            json.add(key, context.serialize(value));
        }
    }

    public static void addOptionally(JsonObject json, String key, Object value, JsonSerializationContext context) {
        if (value != null) {
            json.add(key, context.serialize(value));
        }
    }

}
