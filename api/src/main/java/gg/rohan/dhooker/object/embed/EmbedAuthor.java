package gg.rohan.dhooker.object.embed;

import gg.rohan.dhooker.object.source.SourceRepresent;

public class EmbedAuthor {

    private final String name;
    private final String authorUrl;
    private final SourceRepresent iconUrl;


    public EmbedAuthor(final String name, final String authorUrl, final SourceRepresent iconUrl) {
        this.name = name;
        this.authorUrl = authorUrl;
        this.iconUrl = iconUrl;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthorUrl() {
        return this.authorUrl;
    }

    public SourceRepresent getIconUrl() {
        return this.iconUrl;        
    }

}
