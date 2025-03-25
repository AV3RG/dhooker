package gg.rohan.dhooker.object.component.input;

import gg.rohan.dhooker.object.component.ComponentType;
import gg.rohan.dhooker.object.component.IdentifiableComponent;

public class TextInput implements IdentifiableComponent {

    private final String customId;
    private final TextInput textInputStyle;
    private final String label;
    private final int minLength;
    private final int maxLength;
    private final boolean required;
    private final String preFilledValue;
    private final String placeholder;

    public TextInput(
            String customId,
            TextInput textInputStyle,
            String label,
            int minLength,
            int maxLength,
            boolean required,
            String preFilledValue,
            String placeholder
    ) {
        this.customId = customId;
        this.textInputStyle = textInputStyle;
        this.label = label;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.required = required;
        this.preFilledValue = preFilledValue;
        this.placeholder = placeholder;
    }

    public TextInput getTextInputStyle() {
        return this.textInputStyle;
    }

    public String getLabel() {
        return this.label;
    }

    public int getMinLength() {
        return this.minLength;
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public boolean isRequired() {
        return this.required;
    }

    public String getPreFilledValue() {
        return this.preFilledValue;
    }

    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override
    public String getCustomId() {
        return this.customId;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.TEXT_INPUT;
    }
}
