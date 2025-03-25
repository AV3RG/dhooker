package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

public class SecondaryButton extends IdentifiableButton {

    public SecondaryButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        super(ButtonStyle.SECONDARY, customId, label, emoji, disabled);
    }

}
