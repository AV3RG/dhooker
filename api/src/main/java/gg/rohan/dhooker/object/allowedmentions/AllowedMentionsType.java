package gg.rohan.dhooker.object.allowedmentions;

import gg.rohan.dhooker.serialization.IdentifiedEnum;

import java.util.Locale;

public enum AllowedMentionsType implements IdentifiedEnum<String> {

    ROLES,
    USERS,
    EVERYONE
    ;


    @Override
    public String getIdentifier() {
        return this.name().toLowerCase(Locale.ROOT);
    }

}
