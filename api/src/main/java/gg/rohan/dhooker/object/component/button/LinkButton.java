package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

public class LinkButton extends Button {

    private final String url;
    //TODO: Check if these 2 are allowed
    private final PartialEmoji emoji;
    private final TriState disabled;

    public LinkButton(final String url, final PartialEmoji emoji, final TriState disabled) {
        super(ButtonStyle.LINK);
        this.url = url;
        this.emoji = emoji;
        this.disabled = disabled;
    }

    public String getUrl() {
        return this.url;
    }

    public PartialEmoji getEmoji() {
        return this.emoji;
    }

    public TriState getDisabled() {
        return this.disabled;
    }

}
