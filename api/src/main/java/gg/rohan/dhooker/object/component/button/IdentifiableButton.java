package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.component.IdentifiableComponent;
import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

public abstract class IdentifiableButton extends Button implements IdentifiableComponent {

    private final String customId;
    private final String label;
    private final PartialEmoji emoji;
    private final TriState disabled;

    public IdentifiableButton(
            ButtonStyle buttonStyle,
            String customId,
            String label,
            PartialEmoji emoji,
            TriState disabled
    ) {
        super(buttonStyle);
        this.label = label;
        this.customId = customId;
        this.emoji = emoji;
        this.disabled = disabled;
    }

    @Override
    public String getCustomId() {
        return this.customId;
    }

    public String getLabel() {
        return this.label;
    }

    public PartialEmoji getEmoji() {
        return this.emoji;
    }

    public TriState getDisabled() {
        return this.disabled;
    }

}
