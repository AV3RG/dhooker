package gg.rohan.dhooker.object.poll;

import gg.rohan.dhooker.object.emoji.PartialEmoji;

public class PollMedia {

    private final String text;
    private final PartialEmoji emoji;

    public PollMedia(String text, PartialEmoji emoji) {
        this.text = text;
        this.emoji = emoji;
    }

    public String getText() {
        return this.text;
    }

    public PartialEmoji getEmoji() {
        return this.emoji;
    }

}
