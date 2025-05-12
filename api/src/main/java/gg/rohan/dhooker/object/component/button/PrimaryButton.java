package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

public class PrimaryButton extends IdentifiableButton {

    public PrimaryButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        super(ButtonStyle.PRIMARY, customId, label, emoji, disabled);
    }

    public static PrimaryButton primary(String customId, String label) {
        return new PrimaryButton(customId, label, null, TriState.UNSET);
    }

    public static PrimaryButton primaryButton(String customId, String label, PartialEmoji emoji) {
        return new PrimaryButton(customId, label, emoji, TriState.UNSET);
    }

    public static PrimaryButton primaryButton(String customId, String label, TriState disabled) {
        return new PrimaryButton(customId, label, null, disabled);
    }

    public static PrimaryButton primaryButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        return new PrimaryButton(customId, label, emoji, disabled);
    }

}
