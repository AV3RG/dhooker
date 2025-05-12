package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

public class DangerButton extends IdentifiableButton {

    public DangerButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        super(ButtonStyle.DANGER, customId, label, emoji, disabled);
    }

    public static DangerButton dangerButton(String customId, String label) {
        return new DangerButton(customId, label, null, TriState.UNSET);
    }

    public static DangerButton dangerButton(String customId, String label, PartialEmoji emoji) {
        return new DangerButton(customId, label, emoji, TriState.UNSET);
    }

    public static DangerButton dangerButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        return new DangerButton(customId, label, emoji, disabled);
    }

}
