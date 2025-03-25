package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.object.emoji.PartialEmoji;

public class StringSelectOption {

    private final String label;
    private final String value;
    private final String description;
    private final PartialEmoji partialEmoji;
    private final boolean makeDefault;

    public StringSelectOption(
            String label,
            String value,
            String description,
            PartialEmoji partialEmoji,
            boolean makeDefault
    ) {
        this.label = label;
        this.value = value;
        this.description = description;
        this.partialEmoji = partialEmoji;
        this.makeDefault = makeDefault;
    }

    public String getLabel() {
        return this.label;
    }

    public String getValue() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }

    public PartialEmoji getPartialEmoji() {
        return this.partialEmoji;
    }

    public boolean isMakeDefault() {
        return this.makeDefault;
    }

}
