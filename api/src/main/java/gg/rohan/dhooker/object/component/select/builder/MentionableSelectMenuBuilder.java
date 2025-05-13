package gg.rohan.dhooker.object.component.select.builder;

import gg.rohan.dhooker.object.component.select.MentionableSelectMenu;

public class MentionableSelectMenuBuilder extends SnowflakeSelectMenuBuilder<MentionableSelectMenu> {

    @Override
    public MentionableSelectMenu build() {
        return new MentionableSelectMenu(
                this.customId,
                this.placeholder,
                this.minRequired,
                this.maxRequired,
                this.disabled,
                this.defaultValues
        );
    }
}
