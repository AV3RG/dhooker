package gg.rohan.dhooker.object.poll;

import gg.rohan.dhooker.serialization.IdentifiedEnum;

public enum PollLayoutType implements IdentifiedEnum<Integer> {

    DEFAULT,
    ;

    @Override
    public Integer getIdentifier() {
        return this.ordinal() + 1;
    }

}
