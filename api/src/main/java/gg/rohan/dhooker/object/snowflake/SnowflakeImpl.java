package gg.rohan.dhooker.object.snowflake;

public class SnowflakeImpl implements Snowflake {

    private final long id;

    protected SnowflakeImpl(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String getAsString() {
        return Long.toString(this.id);
    }

    @Override
    public String toString() {
        return this.getAsString();
    }

}
