package gg.rohan.dhooker.object.embed;

import gg.rohan.dhooker.object.util.TriState;

public class EmbedField {

    private final String name;
    private final String value;
    private final TriState inline;

    public EmbedField(final String name, final String value, final TriState inline) {
        this.name = name;
        this.value = value;
        this.inline = inline;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public TriState getInline() {
        return this.inline;
    }

}
