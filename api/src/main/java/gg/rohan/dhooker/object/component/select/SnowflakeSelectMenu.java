package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.object.component.ComponentType;
import gg.rohan.dhooker.object.util.TriState;
import gg.rohan.dhooker.object.util.immutable.Immutables;

import java.util.List;

public abstract class SnowflakeSelectMenu extends SelectMenu {

    private final List<SelectDefaultValue> defaultValues;

    public SnowflakeSelectMenu(
            String customId,
            String placeholder,
            Integer minRequired,
            Integer maxRequired,
            TriState disabled,
            List<SelectDefaultValue> defaultValues
    ) {
        super(ComponentType.USER_SELECT, customId, placeholder, minRequired, maxRequired, disabled);
        this.defaultValues = Immutables.nullableImmutable(defaultValues);
    }

    public List<SelectDefaultValue> getDefaultValues() {
        return this.defaultValues;
    }

}
