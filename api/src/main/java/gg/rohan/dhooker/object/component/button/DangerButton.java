package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

public class DangerButton extends IdentifiableButton {

    public DangerButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        super(ButtonStyle.DANGER, customId, label, emoji, disabled);
    }

}
