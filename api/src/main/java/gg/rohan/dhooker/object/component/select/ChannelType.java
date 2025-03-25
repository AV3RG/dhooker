package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.serialization.IdentifiedEnum;

public enum ChannelType implements IdentifiedEnum<Integer> {

    GUILD_TEXT,
    DM,
    GUILD_VOICE,
    GROUP_DM,
    GUILD_CATEGORY,
    GUILD_ANNOUNCEMENT,
    ANNOUNCEMENT_THREAD,
    PUBLIC_THREAD,
    PRIVATE_THREAD,
    GUILD_STAGE_VOICE,
    GUILD_DIRECTORY,
    GUILD_FORUM,
    GUILD_MEDIA,
    ;


    @Override
    public Integer getIdentifier() {
        return this.ordinal();
    }
}
