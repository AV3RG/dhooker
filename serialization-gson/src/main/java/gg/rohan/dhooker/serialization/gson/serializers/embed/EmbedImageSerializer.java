package gg.rohan.dhooker.serialization.gson.serializers.embed;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.embed.EmbedImage;

import java.lang.reflect.Type;

public class EmbedImageSerializer implements JsonSerializer<EmbedImage> {

    @Override
    public JsonElement serialize(EmbedImage embedImage, Type type, JsonSerializationContext context) {
        return context.serialize(embedImage.getUrl());
    }

}
