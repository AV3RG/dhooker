package gg.rohan.dhooker.object.snowflake;

public interface Snowflake {

    long getId();

    String getAsString();

    static Snowflake snowflake(String s) {
        return new SnowflakeImpl(Long.parseLong(s));
    }

    static Snowflake snowflake(long id) {
        return new SnowflakeImpl(id);
    }

}
