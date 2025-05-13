package gg.rohan.dhooker.object.poll;

import gg.rohan.dhooker.object.emoji.PartialEmoji;

public class PollAnswer {

    private final PollMedia content;

    public PollAnswer(PollMedia content) {
        this.content = content;
    }

    public PollMedia getContent() {
        return this.content;
    }

    public static PollAnswer pollAnswer(String text) {
        return new PollAnswer(PollMedia.pollMedia(text));
    }

    public static PollAnswer pollAnswer(String text, PartialEmoji emoji) {
        return new PollAnswer(PollMedia.pollMedia(text, emoji));
    }

    public static PollAnswer pollAnswer(PollMedia media) {
        return new PollAnswer(media);
    }

}
