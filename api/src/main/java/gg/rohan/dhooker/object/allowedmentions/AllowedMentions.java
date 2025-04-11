package gg.rohan.dhooker.object.allowedmentions;

import gg.rohan.dhooker.object.snowflake.Snowflake;
import gg.rohan.dhooker.object.util.TriState;

import java.util.List;

public class AllowedMentions {

    private final List<AllowedMentionsType> allowedTypes;
    private final List<Snowflake> roles;
    private final List<Snowflake> users;
    private final TriState repliedUser;

    public AllowedMentions(
            List<AllowedMentionsType> allowedTypes,
            List<Snowflake> roles,
            List<Snowflake> users,
            TriState repliedUser
    ) {
        this.allowedTypes = allowedTypes;
        this.roles = roles;
        this.users = users;
        this.repliedUser = repliedUser;
    }

    public List<AllowedMentionsType> getAllowedTypes() {
        return this.allowedTypes;
    }

    public List<Snowflake> getRoles() {
        return this.roles;
    }

    public List<Snowflake> getUsers() {
        return this.users;
    }

    public TriState getRepliedUser() {
        return this.repliedUser;
    }

}
