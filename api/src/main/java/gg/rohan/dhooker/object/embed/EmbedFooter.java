package gg.rohan.dhooker.object.embed;

import gg.rohan.dhooker.object.source.SourceRepresent;
import gg.rohan.dhooker.object.source.UriSourceRepresent;

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

    public static EmbedFooter embedFooter(final String text, final String url) {
        return new EmbedFooter(text, new UriSourceRepresent(url));
    }

    public static EmbedFooter embedFooter(final String text, final SourceRepresent iconUrl) {
        return new EmbedFooter(text, iconUrl);
    }

}
