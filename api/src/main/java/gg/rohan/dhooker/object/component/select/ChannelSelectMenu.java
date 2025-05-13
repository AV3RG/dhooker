package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.object.util.TriState;
import gg.rohan.dhooker.object.util.immutable.Immutables;

import java.util.List;

public class ChannelSelectMenu extends SnowflakeSelectMenu {

    private final List<ChannelType> allowedChannelTypes;

    public ChannelSelectMenu(
            String customId,
            String placeholder,
            Integer minRequired,
            Integer maxRequired,
            TriState disabled,
            List<SelectDefaultValue> defaultValues,
            List<ChannelType> allowedChannelTypes
    ) {
        super(customId, placeholder, minRequired, maxRequired, disabled, defaultValues);
        this.allowedChannelTypes = Immutables.nullableImmutable(allowedChannelTypes);
    }

    public List<ChannelType> getAllowedChannelTypes() {
        return this.allowedChannelTypes;
    }

}