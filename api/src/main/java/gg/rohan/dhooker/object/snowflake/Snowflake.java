package gg.rohan.dhooker.object.snowflake;

public interface Snowflake {

    long getId();

    String getAsString();

    static Snowflake from(String s) {
        return new SnowflakeImpl(Long.parseLong(s));
    }

    static Snowflake from(long id) {
        return new SnowflakeImpl(id);
    }

}
