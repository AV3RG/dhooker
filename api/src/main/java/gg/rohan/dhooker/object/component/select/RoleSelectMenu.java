package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.object.util.TriState;

import java.util.List;

public class RoleSelectMenu extends SnowflakeSelectMenu {

    public RoleSelectMenu(
            String customId,
            String placeholder,
            int minRequired,
            int maxRequired,
            TriState disabled,
            List<SelectDefaultValue> defaultValues
    ) {
        super(customId, placeholder, minRequired, maxRequired, disabled, defaultValues);
    }

}

