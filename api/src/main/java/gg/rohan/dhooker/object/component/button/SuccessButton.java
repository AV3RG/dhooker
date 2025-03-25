package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.emoji.PartialEmoji;
import gg.rohan.dhooker.object.util.TriState;

public class SuccessButton extends IdentifiableButton {

    public SuccessButton(String customId, String label, PartialEmoji emoji, TriState disabled) {
        super(ButtonStyle.SUCCESS, customId, label, emoji, disabled);
    }

}
