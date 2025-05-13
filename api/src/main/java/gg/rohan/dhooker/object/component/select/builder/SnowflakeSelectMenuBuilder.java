package gg.rohan.dhooker.object.component.select.builder;

import gg.rohan.dhooker.object.component.select.SelectDefaultValue;
import gg.rohan.dhooker.object.component.select.SnowflakeSelectMenu;
import gg.rohan.dhooker.object.util.TriState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class SnowflakeSelectMenuBuilder<T extends SnowflakeSelectMenu> extends SelectMenuBuilder<T> {


    protected List<SelectDefaultValue> defaultValues;

    public SnowflakeSelectMenuBuilder<T> addDefaultValues(List<SelectDefaultValue> defaultValues) {
        if (this.defaultValues == null) {
            this.defaultValues = new ArrayList<>(defaultValues);
        } else {
            this.defaultValues.addAll(defaultValues);
        }
        return this;
    }

    public SnowflakeSelectMenuBuilder<T> addDefaultValues(SelectDefaultValue... defaultValues) {
        return this.addDefaultValues(Arrays.asList(defaultValues));
    }

    public SnowflakeSelectMenuBuilder<T> setDefaultValues(List<SelectDefaultValue> defaultValues) {
        this.defaultValues = new ArrayList<>(defaultValues);
        return this;
    }

    public SnowflakeSelectMenuBuilder<T> setDefaultValues(SelectDefaultValue... defaultValues) {
        return this.setDefaultValues(Arrays.asList(defaultValues));
    }

    public List<SelectDefaultValue> getDefaultValues() {
        return this.defaultValues;
    }

    @Override
    public SnowflakeSelectMenuBuilder<T> reset() {
        super.reset();
        this.defaultValues = null;
        return this;
    }

    @Override
    public SnowflakeSelectMenuBuilder<T> from(T object) {
        super.from(object);
        this.defaultValues = object.getDefaultValues();
        return this;
    }
    
}
