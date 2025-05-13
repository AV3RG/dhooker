package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.object.util.TriState;

import java.util.List;

public class UserSelectMenu extends SnowflakeSelectMenu {

    public UserSelectMenu(
            String customId,
            String placeholder,
            Integer minRequired,
            Integer maxRequired,
            TriState disabled,
            List<SelectDefaultValue> defaultValues
    ) {
        super(customId, placeholder, minRequired, maxRequired, disabled, defaultValues);
    }

}