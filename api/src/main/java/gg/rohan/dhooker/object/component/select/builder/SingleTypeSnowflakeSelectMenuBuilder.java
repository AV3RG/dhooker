package gg.rohan.dhooker.object.component.select.builder;

import gg.rohan.dhooker.object.component.select.SelectDefaultValue;
import gg.rohan.dhooker.object.component.select.SelectDefaultValueType;
import gg.rohan.dhooker.object.component.select.SnowflakeSelectMenu;
import gg.rohan.dhooker.object.snowflake.Snowflake;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class SingleTypeSnowflakeSelectMenuBuilder<T extends SnowflakeSelectMenu> extends SnowflakeSelectMenuBuilder<T> {

    private final SelectDefaultValueType type;

    public SingleTypeSnowflakeSelectMenuBuilder(SelectDefaultValueType selectDefaultValueType) {
        this.type = selectDefaultValueType;
    }

    public SnowflakeSelectMenuBuilder<T> addDefaultSnowflakeValues(List<Snowflake> defaultValues) {
        List<SelectDefaultValue> converted = defaultValues.stream().map((snowflake -> new SelectDefaultValue(snowflake, type))).collect(Collectors.toList());
        if (this.defaultValues == null) {
            this.defaultValues = converted;
        } else {
            this.defaultValues.addAll(converted);
        }
        return this;
    }

    public SnowflakeSelectMenuBuilder<T> addDefaultSnowflakeValues(Snowflake... defaultValues) {
        return this.addDefaultSnowflakeValues(Arrays.asList(defaultValues));
    }

    public SnowflakeSelectMenuBuilder<T> setDefaultSnowflakeValues(List<Snowflake> defaultValues) {
        this.defaultValues = defaultValues.stream().map((snowflake -> new SelectDefaultValue(snowflake, type))).collect(Collectors.toList());
        return this;
    }

    public SnowflakeSelectMenuBuilder<T> setDefaultValues(Snowflake... defaultValues) {
        return this.setDefaultSnowflakeValues(Arrays.asList(defaultValues));
    }
}
