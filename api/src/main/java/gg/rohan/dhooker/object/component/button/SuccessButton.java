package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

public class SuccessButton extends IdentifiableButton {

    public SuccessButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        super(ButtonStyle.SUCCESS, customId, label, emoji, disabled);
    }

    public static SuccessButton successButton(String customId, String label) {
        return new SuccessButton(customId, label, null, TriState.UNSET);
    }

    public static SuccessButton successButton(String customId, String label, PartialEmoji emoji) {
        return new SuccessButton(customId, label, emoji, TriState.UNSET);
    }

    public static SuccessButton successButton(String customId, String label, TriState disabled) {
        return new SuccessButton(customId, label, null, disabled);
    }

    public static SuccessButton successButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        return new SuccessButton(customId, label, emoji, disabled);
    }

}
