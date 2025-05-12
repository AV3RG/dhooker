package gg.rohan.dhooker.object.flag;

import java.util.Arrays;
import java.util.List;

public class MessageFlagBitField {

    private final int bitField;

    public MessageFlagBitField(final List<MessageFlagType> flags) {
        // No need to use immutables here, the list is read once and then not used again
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

    public static MessageFlagBitField messageFlagBitField(final List<MessageFlagType> flags) {
        return new MessageFlagBitField(flags);
    }

    public static MessageFlagBitField messageFlagBitField(final MessageFlagType... flags) {
        return new MessageFlagBitField(Arrays.asList(flags));
    }

}
