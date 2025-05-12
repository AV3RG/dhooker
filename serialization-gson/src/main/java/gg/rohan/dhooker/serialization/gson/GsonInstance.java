package gg.rohan.dhooker.serialization.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSerializer;
import gg.rohan.dhooker.object.Message;
import gg.rohan.dhooker.object.snowflake.Snowflake;
import gg.rohan.dhooker.object.source.SourceRepresent;
import gg.rohan.dhooker.object.allowedmentions.AllowedMentions;
import gg.rohan.dhooker.object.component.ComponentContainer;
import gg.rohan.dhooker.object.component.button.IdentifiableButton;
import gg.rohan.dhooker.object.component.button.LinkButton;
import gg.rohan.dhooker.object.component.button.PremiumButton;
import gg.rohan.dhooker.object.component.select.SelectDefaultValue;
import gg.rohan.dhooker.object.component.select.SnowflakeSelectMenu;
import gg.rohan.dhooker.object.component.select.StringSelectMenu;
import gg.rohan.dhooker.object.embed.*;
import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.flag.MessageFlagBitField;
import gg.rohan.dhooker.object.poll.Poll;
import gg.rohan.dhooker.object.poll.PollAnswer;
import gg.rohan.dhooker.object.poll.PollMedia;
import gg.rohan.dhooker.serialization.IdentifiedEnum;
import gg.rohan.dhooker.serialization.gson.serializers.*;
import gg.rohan.dhooker.serialization.gson.serializers.allowedmentions.AllowedMentionSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.component.ComponentContainerSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.component.button.IdentifiableButtonSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.component.button.LinkButtonSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.component.button.PremiumButtonSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.component.select.SelectDefaultValueSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.component.select.SnowflakeSelectMenuSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.component.select.StringSelectMenuSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.embed.*;
import gg.rohan.dhooker.serialization.gson.serializers.emoji.PartialEmojiSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.flag.MessageFlagBitFieldSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.poll.PollAnswerSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.poll.PollMediaSerializer;
import gg.rohan.dhooker.serialization.gson.serializers.poll.PollSerializer;

import java.awt.*;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class GsonInstance {

    private static final Gson GSON;
    private static final Map<Class<?>, JsonSerializer<?>> SERIALIZERS;
    private static final Map<Class<?>, JsonSerializer<?>> HIERARCHY_SERIALIZERS;

    public static Gson getInstance() {
        return GSON;
    }

    static {
        SERIALIZERS = new HashMap<>();
        HIERARCHY_SERIALIZERS = new HashMap<>();

        SERIALIZERS.put(AllowedMentions.class, new AllowedMentionSerializer());

        SERIALIZERS.put(LinkButton.class, new LinkButtonSerializer());
        SERIALIZERS.put(PremiumButton.class, new PremiumButtonSerializer());

        SERIALIZERS.put(SelectDefaultValue.class, new SelectDefaultValueSerializer());
        SERIALIZERS.put(SnowflakeSelectMenu.class, new SnowflakeSelectMenuSerializer());
        SERIALIZERS.put(StringSelectMenu.class, new StringSelectMenuSerializer());

        SERIALIZERS.put(EmbedAuthor.class, new EmbedAuthorSerializer());
        SERIALIZERS.put(EmbedField.class, new EmbedFieldSerializer());
        SERIALIZERS.put(EmbedFooter.class, new EmbedFooterSerializer());
        SERIALIZERS.put(EmbedImage.class, new EmbedImageSerializer());
        SERIALIZERS.put(Embed.class, new EmbedSerializer());
        SERIALIZERS.put(EmbedThumbnail.class, new EmbedThumbnailSerializer());

        SERIALIZERS.put(PartialEmoji.class, new PartialEmojiSerializer());

        SERIALIZERS.put(MessageFlagBitField.class, new MessageFlagBitFieldSerializer());

        SERIALIZERS.put(PollAnswer.class, new PollAnswerSerializer());
        SERIALIZERS.put(PollMedia.class, new PollMediaSerializer());
        SERIALIZERS.put(Poll.class, new PollSerializer());

        SERIALIZERS.put(Color.class, new ColorSerializer());
        SERIALIZERS.put(Instant.class, new InstantSerializer());
        SERIALIZERS.put(Message.class, new MessageSerializer());

        HIERARCHY_SERIALIZERS.put(SourceRepresent.class, new SourceRepresentSerializer());
        HIERARCHY_SERIALIZERS.put(ComponentContainer.class, new ComponentContainerSerializer());
        HIERARCHY_SERIALIZERS.put(IdentifiableButton.class, new IdentifiableButtonSerializer());
        HIERARCHY_SERIALIZERS.put(IdentifiedEnum.class, new IdentifiableEnumSerializer<>());
        HIERARCHY_SERIALIZERS.put(Snowflake.class, new SnowflakeSerializer());


        GsonBuilder gsonBuilder = new GsonBuilder();
        HIERARCHY_SERIALIZERS.forEach(gsonBuilder::registerTypeHierarchyAdapter);
        SERIALIZERS.forEach(gsonBuilder::registerTypeAdapter);
        GSON = gsonBuilder.create();
    }

}
