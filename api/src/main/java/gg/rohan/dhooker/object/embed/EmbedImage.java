package gg.rohan.dhooker.object.embed;

import gg.rohan.dhooker.object.source.SourceRepresent;
import gg.rohan.dhooker.object.source.UriSourceRepresent;

public class EmbedImage {

    private final SourceRepresent url;

    public EmbedImage(final SourceRepresent url) {
        this.url = url;
    }

    public SourceRepresent getUrl() {
        return this.url;
    }

    public EmbedImage embedImage(final String url) {
        return new EmbedImage(new UriSourceRepresent(url));
    }

    public EmbedImage embedImage(final SourceRepresent url) {
        return new EmbedImage(url);
    }

}
