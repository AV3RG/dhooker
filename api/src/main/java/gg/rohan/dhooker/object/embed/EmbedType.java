package gg.rohan.dhooker.object.embed;

import gg.rohan.dhooker.serialization.IdentifiedEnum;

import java.util.Locale;

public enum EmbedType implements IdentifiedEnum<String> {

    RICH,
    IMAGE,
    VIDEO,
    GIFV,
    ARTICLE,
    LINK,
    POLL_RESULT
    ;

    @Override
    public String getIdentifier() {
        return this.name().toLowerCase(Locale.ROOT);
    }

}
