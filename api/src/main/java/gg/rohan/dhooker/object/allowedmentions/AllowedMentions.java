package gg.rohan.dhooker.object.allowedmentions;

import gg.rohan.dhooker.object.snowflake.Snowflake;

import java.util.List;

public class AllowedMentions {

    private final List<AllowedMentionsType> allowedTypes;
    private final List<Snowflake> roles;
    private final List<String> users;
    private final boolean repliedUser;

    public AllowedMentions(List<AllowedMentionsType> allowedTypes, List<Snowflake> roles, boolean repliedUser) {
        this.allowedTypes = allowedTypes;
        this.roles = roles;
        this.users = null;
        this.repliedUser = repliedUser;
    }

    public List<AllowedMentionsType> getAllowedTypes() {
        return this.allowedTypes;
    }

    public List<Snowflake> getRoles() {
        return this.roles;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public boolean isRepliedUser() {
        return this.repliedUser;
    }

}
