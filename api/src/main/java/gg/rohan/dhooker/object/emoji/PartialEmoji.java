package gg.rohan.dhooker.object.emoji;

import gg.rohan.dhooker.object.snowflake.Snowflake;
import gg.rohan.dhooker.object.util.TriState;

public class PartialEmoji {

    private final Snowflake id;
    private final String name;
    private final TriState animated;

    public PartialEmoji(Snowflake id, String name, TriState animated) {
        this.id = id;
        this.name = name;
        this.animated = animated;
    }

    public Snowflake getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public TriState getAnimated() {
        return this.animated;
    }

    public PartialEmoji partialEmoji(String name, boolean animated) {
        return new PartialEmoji(null, name, TriState.fromBoolean(animated));
    }

    public PartialEmoji partialEmoji(String name, TriState animated) {
        return new PartialEmoji(null, name, animated);
    }

    public PartialEmoji partialEmoji(Snowflake id, String name, boolean animated) {
        return new PartialEmoji(id, name, TriState.fromBoolean(animated));
    }

    public PartialEmoji partialEmoji(Snowflake id, String name, TriState animated) {
        return new PartialEmoji(id, name, animated);
    }

}
