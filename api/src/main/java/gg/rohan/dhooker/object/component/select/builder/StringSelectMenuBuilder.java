package gg.rohan.dhooker.object.component.select.builder;

import gg.rohan.dhooker.object.component.select.StringSelectMenu;
import gg.rohan.dhooker.object.component.select.StringSelectOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSelectMenuBuilder extends SelectMenuBuilder<StringSelectMenu> {

    private List<StringSelectOption> options;

    public StringSelectMenuBuilder addOptions(List<StringSelectOption> options) {
        if (this.options == null) {
            this.options = new ArrayList<>(options);
        } else {
            this.options.addAll(options);
        }
        return this;
    }

    public StringSelectMenuBuilder addOptions(StringSelectOption... options) {
        return this.addOptions(Arrays.asList(options));
    }

    public StringSelectMenuBuilder setOptions(List<StringSelectOption> options) {
        this.options = new ArrayList<>(options);
        return this;
    }

    public StringSelectMenuBuilder setOptions(StringSelectOption... options) {
        return this.setOptions(Arrays.asList(options));
    }

    @Override
    public StringSelectMenu build() {
        return new StringSelectMenu(
                this.customId,
                this.placeholder,
                this.minRequired,
                this.maxRequired,
                this.disabled,
                this.options
        );
    }

    @Override
    public SelectMenuBuilder<StringSelectMenu> reset() {
        super.reset();
        this.options = null;
        return this;
    }

    @Override
    public SelectMenuBuilder<StringSelectMenu> from(StringSelectMenu object) {
        super.from(object);
        this.options = object.getOptions();
        return this;
    }
}
