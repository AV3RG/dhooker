package gg.rohan.dhooker.object.component.select.builder;

import gg.rohan.dhooker.object.builder.AbstractBuilder;
import gg.rohan.dhooker.object.component.select.SelectDefaultValue;
import gg.rohan.dhooker.object.component.select.SelectMenu;
import gg.rohan.dhooker.object.util.TriState;

import java.util.List;

public abstract class SelectMenuBuilder<T extends SelectMenu> implements AbstractBuilder<SelectMenuBuilder<T>, T> {

    protected String customId;
    protected String placeholder;
    protected Integer minRequired;
    protected Integer maxRequired;
    protected TriState disabled;

    public SelectMenuBuilder<T> setCustomId(String customId) {
        this.customId = customId;
        return this;
    }

    public SelectMenuBuilder<T> setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    public SelectMenuBuilder<T> setMinRequired(Integer minRequired) {
        this.minRequired = minRequired;
        return this;
    }

    public SelectMenuBuilder<T> setMaxRequired(Integer maxRequired) {
        this.maxRequired = maxRequired;
        return this;
    }

    public SelectMenuBuilder<T> setDisabled(TriState disabled) {
        this.disabled = disabled;
        return this;
    }

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

    @Override
    public SelectMenuBuilder<T> reset() {
        this.customId = null;
        this.placeholder = null;
        this.minRequired = null;
        this.maxRequired = null;
        this.disabled = null;
        return this;
    }

    @Override
    public SelectMenuBuilder<T> from(T object) {
        this.customId = object.getCustomId();
        this.placeholder = object.getPlaceholder();
        this.minRequired = object.getMinRequired();
        this.maxRequired = object.getMaxRequired();
        this.disabled = object.getDisabled();
        return this;
    }
}
