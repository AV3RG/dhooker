package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.object.snowflake.Snowflake;

public class SelectDefaultValue {

    private final Snowflake id;
    private final SelectDefaultValueType type;

    public SelectDefaultValue(Snowflake id, SelectDefaultValueType type) {
        this.id = id;
        this.type = type;
    }

    public Snowflake getId() {
        return id;
    }

    public SelectDefaultValueType getType() {
        return type;
    }

}
