package gg.rohan.dhooker.object.embed;

import gg.rohan.dhooker.object.source.SourceRepresent;

public class EmbedFooter {

    private final String text;
    private final SourceRepresent iconUrl;

    public EmbedFooter(final String text, final SourceRepresent iconUrl) {
        this.text = text;
        this.iconUrl = iconUrl;
    }

    public String getText() {
        return this.text;
    }

    public SourceRepresent getIconUrl() {
        return this.iconUrl;
    }

}
