package gg.rohan.dhooker.object.component.button;

import gg.rohan.dhooker.object.component.Component;
import gg.rohan.dhooker.object.component.ComponentType;

public abstract class Button implements Component {

    private final ButtonStyle style;

    public Button(ButtonStyle style) {
        this.style = style;
    }

    public ButtonStyle getStyle() {
        return this.style;
    }

    public ComponentType getType() {
        return ComponentType.BUTTON;
    }
}
