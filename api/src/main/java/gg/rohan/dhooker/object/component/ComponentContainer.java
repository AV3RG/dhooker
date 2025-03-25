package gg.rohan.dhooker.object.component;

import java.util.List;

public abstract class ComponentContainer implements Component {

    public ComponentContainer() {

    }

    public abstract List<Component> getChildren();
}
