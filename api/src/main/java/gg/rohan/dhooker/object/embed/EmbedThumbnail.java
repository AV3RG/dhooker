package gg.rohan.dhooker.object.embed;

import gg.rohan.dhooker.object.source.SourceRepresent;

public class EmbedThumbnail {

    private final SourceRepresent url;

    public EmbedThumbnail(final SourceRepresent url) {
        this.url = url;
    }

    public SourceRepresent getUrl() {
        return this.url;
    }

}
