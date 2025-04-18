package gg.rohan.dhooker.object.embed;

import gg.rohan.dhooker.object.source.SourceRepresent;
import gg.rohan.dhooker.object.source.UriSourceRepresent;

public class EmbedThumbnail {

    private final SourceRepresent url;

    public EmbedThumbnail(final SourceRepresent url) {
        this.url = url;
    }

    public SourceRepresent getUrl() {
        return this.url;
    }

    public EmbedThumbnail embedThumbnail(final String url) {
        return new EmbedThumbnail(new UriSourceRepresent(url));
    }

}
