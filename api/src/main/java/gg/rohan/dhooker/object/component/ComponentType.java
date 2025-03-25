package gg.rohan.dhooker.object.component;

import gg.rohan.dhooker.serialization.IdentifiedEnum;

public enum ComponentType implements IdentifiedEnum<Integer> {

    ACTION_ROW,
    BUTTON,
    STRING_SELECT,
    TEXT_INPUT,
    USER_SELECT,
    ROLE_SELECT,
    MENTIONABLE_SELECT,
    CHANNEL_SELECT,
    ;

    @Override
    public Integer getIdentifier() {
        return this.ordinal() + 1;
    }

}
