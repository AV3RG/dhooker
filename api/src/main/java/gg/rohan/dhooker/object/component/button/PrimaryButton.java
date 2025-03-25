package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

public class PrimaryButton extends IdentifiableButton {

    public PrimaryButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        super(ButtonStyle.PRIMARY, customId, label, emoji, disabled);
    }

}
