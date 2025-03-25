package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.object.util.TriState;

import java.util.List;

public class ChannelSelectMenu extends SnowflakeSelectMenu {

    private final List<ChannelType> allowedChannelTypes;

    public ChannelSelectMenu(
            String customId,
            String placeholder,
            int minRequired,
            int maxRequired,
            TriState disabled,
            List<SelectDefaultValue> defaultValues,
            List<ChannelType> allowedChannelTypes
    ) {
        super(customId, placeholder, minRequired, maxRequired, disabled, defaultValues);
        this.allowedChannelTypes = allowedChannelTypes;
    }

    public List<ChannelType> getAllowedChannelTypes() {
        return this.allowedChannelTypes;
    }

}