package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.serialization.IdentifiedEnum;

public enum ButtonStyle implements IdentifiedEnum<Integer> {

    PRIMARY,
    SECONDARY,
    SUCCESS,
    DANGER,
    LINK,
    PREMIUM,
    ;

    @Override
    public Integer getIdentifier() {
        return this.ordinal() + 1;
    }

}
