package gg.rohan.dhooker.object.embed.builder;

import gg.rohan.dhooker.object.builder.AbstractBuilder;
import gg.rohan.dhooker.object.embed.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.Instant;

public class EmbedBuilder implements AbstractBuilder<EmbedBuilder, Embed> {

    private String title;
    private String description;
    private String url;
    private Instant timestamp;
    private Color color;
    private EmbedFooter footer;
    private EmbedImage image;
    private EmbedThumbnail thumbnail;
    private EmbedAuthor author;
    private List<EmbedField> embedFieldList;

    @Override
    public Embed build() {
        return new Embed(
                this.title,
                this.description,
                this.url,
                this.timestamp,
                this.color,
                this.footer,
                this.image,
                this.thumbnail,
                this.author,
                this.embedFieldList
        );
    }

    @Override
    public EmbedBuilder reset() {
        this.title = null;
        this.description = null;
        this.url = null;
        this.timestamp = null;
        this.color = null;
        this.footer = null;
        this.image = null;
        this.thumbnail = null;
        this.author = null;
        this.embedFieldList = null;
        return this;
    }

    @Override
    public EmbedBuilder from(Embed object) {
        this.title = object.getTitle();
        this.description = object.getDescription();
        this.url = object.getUrl();
        this.timestamp = object.getTimestamp();
        this.color = object.getColor();
        this.footer = object.getFooter();
        this.image = object.getImage();
        this.thumbnail = object.getThumbnail();
        this.author = object.getAuthor();
        this.embedFieldList = object.getFields();
        return this;
    }

    public EmbedBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public EmbedBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public EmbedBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public EmbedBuilder setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public EmbedBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public EmbedBuilder setFooter(EmbedFooter footer) {
        this.footer = footer;
        return this;
    }

    public EmbedBuilder setImage(EmbedImage image) {
        this.image = image;
        return this;
    }

    public EmbedBuilder setThumbnail(EmbedThumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public EmbedBuilder setAuthor(EmbedAuthor author) {
        this.author = author;
        return this;
    }

    public EmbedBuilder setEmbedFieldList(List<EmbedField> embedFieldList) {
        this.embedFieldList = embedFieldList;
        return this;
    }

    public EmbedBuilder addEmbedFields(List<EmbedField> embedFields) {
        if (this.embedFieldList == null) {
            this.embedFieldList = new ArrayList<>();
        }
        this.embedFieldList.addAll(embedFields);
        return this;
    }

    public EmbedBuilder addEmbedFields(EmbedField... embedField) {
        return this.addEmbedFields(Arrays.asList(embedField));
    }

    public String getTitle() {
        return this.title;
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

    public List<EmbedField> getEmbedFieldList() {
        return this.embedFieldList;
    }

}
