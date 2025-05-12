package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

public class SecondaryButton extends IdentifiableButton {

    public SecondaryButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        super(ButtonStyle.SECONDARY, customId, label, emoji, disabled);
    }

    public static SecondaryButton secondaryButton(String customId, String label) {
        return new SecondaryButton(customId, label, null, TriState.UNSET);
    }

    public static SecondaryButton secondaryButton(String customId, String label, PartialEmoji emoji) {
        return new SecondaryButton(customId, label, emoji, TriState.UNSET);
    }

    public static SecondaryButton secondaryButton(String customId, String label, TriState disabled) {
        return new SecondaryButton(customId, label, null, disabled);
    }

    public static SecondaryButton secondaryButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        return new SecondaryButton(customId, label, emoji, disabled);
    }

}
