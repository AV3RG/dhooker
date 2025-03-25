package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.object.component.ComponentType;
import gg.rohan.dhooker.object.util.TriState;

import java.util.List;

public abstract class SnowflakeSelectMenu extends SelectMenu {

    private final List<SelectDefaultValue> defaultValues;

    public SnowflakeSelectMenu(
            String customId,
            String placeholder,
            int minRequired,
            int maxRequired,
            TriState disabled,
            List<SelectDefaultValue> defaultValues
    ) {
        super(ComponentType.USER_SELECT, customId, placeholder, minRequired, maxRequired, disabled);
        this.defaultValues = defaultValues;
    }

    public List<SelectDefaultValue> getDefaultValues() {
        return this.defaultValues;
    }

}
