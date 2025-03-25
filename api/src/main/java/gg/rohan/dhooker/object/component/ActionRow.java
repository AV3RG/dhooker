package gg.rohan.dhooker.object.component;

import java.util.List;

public class ActionRow extends ComponentContainer {

    private final List<Component> children;

    public ActionRow(List<Component> children) {
        this.children = children;
    }

    @Override
    public List<Component> getChildren() {
        return children;
    }

    @Override
    public ComponentType getType() {
        return ComponentType.ACTION_ROW;
    }

}
