package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.object.component.ComponentType;
import gg.rohan.dhooker.object.util.TriState;

import java.util.List;

public class StringSelectMenu extends SelectMenu {

    private final List<StringSelectOption> options;

    public StringSelectMenu(
            String customId,
            String placeholder,
            int minRequired,
            int maxRequired,
            TriState disabled,
            List<StringSelectOption> options
    ) {
        super(ComponentType.STRING_SELECT, customId, placeholder, minRequired, maxRequired, disabled);
        this.options = options;
    }

    public List<StringSelectOption> getOptions() {
        return this.options;
    }

}
