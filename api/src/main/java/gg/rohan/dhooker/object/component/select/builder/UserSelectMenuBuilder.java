package gg.rohan.dhooker.object.component.select.builder;

import gg.rohan.dhooker.object.component.select.SelectDefaultValueType;
import gg.rohan.dhooker.object.component.select.UserSelectMenu;

public class UserSelectMenuBuilder extends SingleTypeSnowflakeSelectMenuBuilder<UserSelectMenu> {

    public UserSelectMenuBuilder() {
        super(SelectDefaultValueType.USER);
    }

    @Override
    public UserSelectMenu build() {
        return new UserSelectMenu(
                this.customId,
                this.placeholder,
                this.minRequired,
                this.maxRequired,
                this.disabled,
                this.defaultValues
        );
    }
}
