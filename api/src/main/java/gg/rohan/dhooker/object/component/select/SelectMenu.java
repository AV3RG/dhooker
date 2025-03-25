package gg.rohan.dhooker.object.component.select;

import gg.rohan.dhooker.object.component.ComponentType;
import gg.rohan.dhooker.object.component.IdentifiableComponent;
import gg.rohan.dhooker.object.util.TriState;

public abstract class SelectMenu implements IdentifiableComponent {

    private final ComponentType type;
    private final String customId;
    private final String placeholder;
    private final Integer minRequired;
    private final Integer maxRequired;
    private final TriState disabled;

    public SelectMenu(
            ComponentType type,
            String customId,
            String placeholder,
            int minRequired,
            int maxRequired,
            TriState disabled
    ) {
        this.type = type;
        this.customId = customId;
        this.placeholder = placeholder;
        this.minRequired = minRequired;
        this.maxRequired = maxRequired;
        this.disabled = disabled;
    }

    @Override
    public ComponentType getType() {
        return this.type;
    }

    @Override
    public String getCustomId() {
        return this.customId;
    }

    public String getPlaceholder() {
        return this.placeholder;
    }

    public Integer getMinRequired() {
        return this.minRequired;
    }

    public Integer getMaxRequired() {
        return this.maxRequired;
    }

    public TriState getDisabled() {
        return this.disabled;
    }

}
