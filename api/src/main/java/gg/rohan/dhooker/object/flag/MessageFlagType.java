package gg.rohan.dhooker.object.flag;

import gg.rohan.dhooker.object.Message;

public enum MessageFlagType {

    CROSSPOSTED(0),
    IS_CROSSPOST(1),
    SUPPRESS_EMBEDS(2),
    SOURCE_MESSAGE_DELETED(3),
    URGENT(4),
    HAS_THREAD(5),
    EPHEMERAL(6),
    LOADING(7),
    FAILED_TO_MENTION_SOME_ROLES_IN_THREAD(8),
    SUPPRESS_NOTIFICATIONS(12),
    IS_VOICE_MESSAGE(13),
    HAS_SNAPSHOT(14),
    ;

    private final int bitPosition;

    MessageFlagType(int bitPosition) {
        this.bitPosition = bitPosition;
    }

    public int getBit() {
        return this.bitPosition;
    }

}
