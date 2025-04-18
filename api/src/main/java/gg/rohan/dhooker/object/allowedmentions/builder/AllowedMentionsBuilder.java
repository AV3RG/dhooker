package gg.rohan.dhooker.object.allowedmentions.builder;

import gg.rohan.dhooker.object.allowedmentions.AllowedMentions;
import gg.rohan.dhooker.object.allowedmentions.AllowedMentionsType;
import gg.rohan.dhooker.object.builder.AbstractBuilder;
import gg.rohan.dhooker.object.snowflake.Snowflake;
import gg.rohan.dhooker.object.util.TriState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllowedMentionsBuilder implements AbstractBuilder<AllowedMentionsBuilder, AllowedMentions> {

    private List<AllowedMentionsType> allowedTypes;
    private List<Snowflake> roles;
    private List<Snowflake> users;
    private TriState repliedUser;

    public AllowedMentionsBuilder() {}

    public AllowedMentionsBuilder addAllowedTypes(List<AllowedMentionsType> allowedTypes) {
        if (this.allowedTypes == null) {
            this.allowedTypes = new ArrayList<>(allowedTypes);
        } else {
            this.allowedTypes.addAll(allowedTypes);
        }
        return this;
    }

    public AllowedMentionsBuilder addAllowedTypes(AllowedMentionsType... allowedTypes) {
        return this.addAllowedTypes(Arrays.asList(allowedTypes));
    }

    public AllowedMentionsBuilder setAllowedTypes(List<AllowedMentionsType> allowedTypes) {
        this.allowedTypes = new ArrayList<>(allowedTypes);
        return this;
    }

    public AllowedMentionsBuilder setAllowedTypes(AllowedMentionsType... allowedTypes) {
        return this.setAllowedTypes(Arrays.asList(allowedTypes));
    }

    public AllowedMentionsBuilder addRoles(List<Snowflake> roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>(roles);
        } else {
            this.roles.addAll(roles);
        }
        return this;
    }

    public AllowedMentionsBuilder addRoles(Snowflake... roles) {
        return this.addRoles(Arrays.asList(roles));
    }

    public AllowedMentionsBuilder setRoles(List<Snowflake> roles) {
        this.roles = new ArrayList<>(roles);
        return this;
    }

    public AllowedMentionsBuilder setRoles(Snowflake... roles) {
        return this.setRoles(Arrays.asList(roles));
    }

    public AllowedMentionsBuilder addUsers(List<Snowflake> users) {
        if (this.users == null) {
            this.users = new ArrayList<>(users);
        }
        this.users.addAll(users);
        return this;
    }

    public AllowedMentionsBuilder addUsers(Snowflake... users) {
        return this.addUsers(Arrays.asList(users));
    }

    public AllowedMentionsBuilder setUsers(List<Snowflake> users) {
        this.users = new ArrayList<>(users);
        return this;
    }

    public AllowedMentionsBuilder setUsers(Snowflake... users) {
        return this.setUsers(Arrays.asList(users));
    }

    public AllowedMentionsBuilder setRepliedUser(TriState repliedUser) {
        this.repliedUser = repliedUser;
        return this;
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

    @Override
    public AllowedMentions build() {
        return new AllowedMentions(
                this.allowedTypes,
                this.roles,
                this.users,
                this.repliedUser
        );
    }

    @Override
    @SuppressWarnings("CloneDoesntCallSuperClone")
    public AllowedMentionsBuilder clone() {
        return new AllowedMentionsBuilder()
                .setAllowedTypes(this.allowedTypes)
                .setRoles(this.roles)
                .setUsers(this.users)
                .setRepliedUser(this.repliedUser);
    }

    @Override
    public AllowedMentionsBuilder reset() {
        this.allowedTypes = null;
        this.roles = null;
        this.users = null;
        this.repliedUser = null;
        return this;
    }

    @Override
    public AllowedMentionsBuilder from(AllowedMentions object) {
        this.allowedTypes = object.getAllowedTypes();
        this.roles = object.getRoles();
        this.users = object.getUsers();
        this.repliedUser = object.getRepliedUser();
        return this;
    }
}
