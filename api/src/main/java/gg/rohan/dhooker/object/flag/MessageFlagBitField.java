package gg.rohan.dhooker.object.flag;

import java.util.List;

public class MessageFlagBitField {

    private final int bitField;

    public MessageFlagBitField(final List<MessageFlagType> flags) {
        int bitField = 0;
        for (final MessageFlagType flag : flags) {
            bitField |= (1 << flag.getBit());
        }
        this.bitField = bitField;
    }

    public int getBitField() {
        return this.bitField;
    }

    public boolean isSet(final MessageFlagType flag) {
        return (this.bitField & 1 << flag.getBit()) == (1 << flag.getBit());
    }

}
