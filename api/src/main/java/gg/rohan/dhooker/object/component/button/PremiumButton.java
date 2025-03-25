package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.util.TriState;

public class PremiumButton extends Button {

    private final String skuId;
    //TODO: Check if allowed
    private final TriState disabled;

    public PremiumButton(ButtonStyle style, String skuId, TriState disabled) {
        super(ButtonStyle.PREMIUM);
        this.skuId = skuId;
        this.disabled = disabled;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public TriState getDisabled() {
        return this.disabled;
    }

}
