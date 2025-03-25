package gg.rohan.dhooker.object;

import gg.rohan.dhooker.object.allowedmentions.AllowedMentions;
import gg.rohan.dhooker.object.attachment.PartialAttachment;
import gg.rohan.dhooker.object.component.ComponentContainer;
import gg.rohan.dhooker.object.embed.Embed;
import gg.rohan.dhooker.object.flag.MessageFlagBitField;
import gg.rohan.dhooker.object.poll.Poll;
import gg.rohan.dhooker.object.snowflake.Snowflake;
import gg.rohan.dhooker.object.util.TriState;

import java.util.List;

public class Message {

    private final String content;
    private final String username;
    private final String avatarUrl;
    private final TriState tts;
    private final List<Embed> embeds;
    private final AllowedMentions allowedMentions;
    private final List<ComponentContainer> components;
    private final List<PartialAttachment> attachments;
    private final MessageFlagBitField messageFlagBitField;
    private final String threadName;
    private final List<Snowflake> appliedTags;
    private final Poll poll;

    public Message(
            String content,
            String username,
            String avatarUrl,
            TriState tts,
            List<Embed> embeds,
            AllowedMentions allowedMentions,
            List<ComponentContainer> components,
            List<PartialAttachment> attachments,
            MessageFlagBitField messageFlagBitField,
            String threadName,
            List<Snowflake> appliedTags,
            Poll poll
    ) {
        this.content = content;
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.tts = tts;
        this.embeds = embeds;
        this.allowedMentions = allowedMentions;
        this.components = components;
        this.attachments = attachments;
        this.messageFlagBitField = messageFlagBitField;
        this.threadName = threadName;
        this.appliedTags = appliedTags;
        this.poll = poll;
    }

    public String getContent() {
        return this.content;
    }

    public String getUsername() {
        return this.username;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public TriState isTts() {
        return this.tts;
    }

    public List<Embed> getEmbeds() {
        return this.embeds;
    }

    public AllowedMentions getAllowedMentions() {
        return this.allowedMentions;
    }

    public List<ComponentContainer> getComponents() {
        return this.components;
    }

    public List<PartialAttachment> getAttachments() {
        return this.attachments;
    }

    public MessageFlagBitField getMessageFlagBitField() {
        return this.messageFlagBitField;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public List<Snowflake> getAppliedTags() {
        return this.appliedTags;
    }

    public Poll getPoll() {
        return this.poll;
    }

}
