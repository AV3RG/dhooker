package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.serialization.IdentifiedEnum;

import java.util.Locale;

public enum SelectDefaultValueType implements IdentifiedEnum<String> {
    USER,
    ROLE,
    CHANNEL,
    ;

    @Override
    public String getIdentifier() {
        return this.name().toLowerCase(Locale.ROOT);
    }
}
