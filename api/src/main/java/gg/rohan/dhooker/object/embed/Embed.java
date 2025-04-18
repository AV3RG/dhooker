package gg.rohan.dhooker.object.embed;

import java.awt.*;
import java.time.Instant;
import java.util.List;

public class Embed {

    private final String title;
    private final EmbedType embedType;
    private final String description;
    private final String url;
    private final Instant timestamp;
    private final Color color;
    private final EmbedFooter footer;
    private final EmbedImage image;
    private final EmbedThumbnail thumbnail;
    private final EmbedAuthor author;
    private final List<EmbedField> fields;

    public Embed(
            String title,
            String description,
            String url,
            Instant timestamp,
            Color color,
            EmbedFooter footer,
            EmbedImage image,
            EmbedThumbnail thumbnail,
            EmbedAuthor author,
            List<EmbedField> fields
    ) {
        this.title = title;
        this.embedType = EmbedType.RICH;
        this.description = description;
        this.url = url;
        this.timestamp = timestamp;
        this.color = color;
        this.footer = footer;
        this.image = image;
        this.thumbnail = thumbnail;
        this.author = author;
        this.fields = fields;
    }

    public String getTitle() {
        return this.title;
    }

    public EmbedType getEmbedType() {
        return this.embedType;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUrl() {
        return this.url;
    }

    public Instant getTimestamp() {
        return this.timestamp;
    }

    public Color getColor() {
        return this.color;
    }

    public EmbedFooter getFooter() {
        return this.footer;
    }

    public EmbedImage getImage() {
        return this.image;
    }

    public EmbedThumbnail getThumbnail() {
        return this.thumbnail;
    }

    public EmbedAuthor getAuthor() {
        return this.author;
    }

    public List<EmbedField> getFields() {
        return this.fields;
    }

}
