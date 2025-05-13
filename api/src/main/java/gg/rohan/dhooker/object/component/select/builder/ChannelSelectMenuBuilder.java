package gg.rohan.dhooker.object.component.select.builder;

import gg.rohan.dhooker.object.component.select.ChannelSelectMenu;
import gg.rohan.dhooker.object.component.select.ChannelType;
import gg.rohan.dhooker.object.component.select.SelectDefaultValueType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChannelSelectMenuBuilder extends SingleTypeSnowflakeSelectMenuBuilder<ChannelSelectMenu> {

    private List<ChannelType> allowedChannelTypes;

    public ChannelSelectMenuBuilder() {
        super(SelectDefaultValueType.CHANNEL);
    }

    public ChannelSelectMenuBuilder addAllowedChannelTypes(List<ChannelType> allowedChannelTypes) {
        if (this.allowedChannelTypes == null) {
            this.allowedChannelTypes = new ArrayList<>(allowedChannelTypes);
        } else {
            this.allowedChannelTypes.addAll(allowedChannelTypes);
        }
        return this;
    }

    public ChannelSelectMenuBuilder addAllowedChannelTypes(ChannelType... allowedChannelTypes) {
        return this.addAllowedChannelTypes(Arrays.asList(allowedChannelTypes));
    }

    public ChannelSelectMenuBuilder setAllowedChannelTypes(List<ChannelType> allowedChannelTypes) {
        this.allowedChannelTypes = new ArrayList<>(allowedChannelTypes);
        return this;
    }

    public ChannelSelectMenuBuilder setAllowedChannelTypes(ChannelType... allowedChannelTypes) {
        return this.setAllowedChannelTypes(Arrays.asList(allowedChannelTypes));
    }

    public List<ChannelType> getAllowedChannelTypes() {
        return this.allowedChannelTypes;
    }

    @Override
    public ChannelSelectMenu build() {
        return new ChannelSelectMenu(
                this.customId,
                this.placeholder,
                this.minRequired,
                this.maxRequired,
                this.disabled,
                this.defaultValues,
                this.allowedChannelTypes
        );
    }

    @Override
    public SnowflakeSelectMenuBuilder<ChannelSelectMenu> reset() {
        super.reset();
        this.allowedChannelTypes = null;
        return this;
    }

    @Override
    public SnowflakeSelectMenuBuilder<ChannelSelectMenu> from(ChannelSelectMenu object) {
        super.from(object);
        this.allowedChannelTypes = object.getAllowedChannelTypes();
        return this;
    }
}
