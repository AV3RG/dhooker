package gg.rohan.dhooker.object.component.select.builder;

import gg.rohan.dhooker.object.component.select.RoleSelectMenu;
import gg.rohan.dhooker.object.component.select.SelectDefaultValueType;

public class RoleSelectMenuBuilder extends SingleTypeSnowflakeSelectMenuBuilder<RoleSelectMenu> {

    public RoleSelectMenuBuilder() {
        super(SelectDefaultValueType.ROLE);
    }

    @Override
    public RoleSelectMenu build() {
        return new RoleSelectMenu(
                this.customId,
                this.placeholder,
                this.minRequired,
                this.maxRequired,
                this.disabled,
                this.defaultValues
        );
    }

}
