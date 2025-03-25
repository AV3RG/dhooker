package gg.rohan.dhooker.object.embed;

import gg.rohan.dhooker.object.source.SourceRepresent;

public class EmbedImage {

    private final SourceRepresent url;

    public EmbedImage(final SourceRepresent url) {
        this.url = url;
    }

    public SourceRepresent getUrl() {
        return this.url;
    }

}
