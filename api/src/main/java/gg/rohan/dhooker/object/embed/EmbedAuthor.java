package gg.rohan.dhooker.object.embed;

import gg.rohan.dhooker.object.source.SourceRepresent;
import gg.rohan.dhooker.object.source.UriSourceRepresent;

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

    public static EmbedAuthor embedAuthor(final String name, final String authorUrl, final String iconUrl) {
        return new EmbedAuthor(name, authorUrl, new UriSourceRepresent(iconUrl));
    }

    public static EmbedAuthor embedAuthor(final String name, final String authorUrl, final SourceRepresent iconUrl) {
        return new EmbedAuthor(name, authorUrl, iconUrl);
    }

}
