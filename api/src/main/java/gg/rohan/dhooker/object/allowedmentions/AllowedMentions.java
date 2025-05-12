package gg.rohan.dhooker.object.allowedmentions;

import gg.rohan.dhooker.object.snowflake.Snowflake;
import gg.rohan.dhooker.object.util.TriState;
import gg.rohan.dhooker.object.util.immutable.Immutables;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllowedMentions {

    public static AllowedMentions NONE = new AllowedMentions(Collections.emptyList(), null, null, TriState.FALSE);

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
        this.allowedTypes = Immutables.nullableImmutable(allowedTypes);
        this.roles = Immutables.nullableImmutable(roles);
        this.users = Immutables.nullableImmutable(users);
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

    public static AllowedMentions allowedMentions(List<AllowedMentionsType> allowedMentionsTypes) {
        return new AllowedMentions(allowedMentionsTypes, null, null, TriState.UNSET);
    }

    public static AllowedMentions allowedMentions(AllowedMentionsType... allowedMentionsTypes) {
        return new AllowedMentions(Arrays.asList(allowedMentionsTypes), null, null, TriState.UNSET);
    }

    public static AllowedMentions allowedMentions(List<AllowedMentionsType> allowedMentionsTypes, List<Snowflake> users) {
        return new AllowedMentions(allowedMentionsTypes, null, users, TriState.UNSET);
    }

    public static AllowedMentions allowedMentions(List<AllowedMentionsType> allowedMentionsTypes, Snowflake... users) {
        return new AllowedMentions(allowedMentionsTypes, null, Arrays.asList(users), TriState.UNSET);
    }

    public static AllowedMentions allowedMentions(List<AllowedMentionsType> allowedMentionsTypes, List<Snowflake> roles, List<Snowflake> users, TriState repliedUser) {
        return new AllowedMentions(allowedMentionsTypes, roles, users, repliedUser);
    }

}
