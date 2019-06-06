package br.faj.users.domain;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessGroupsUsers {

    @JsonProperty ("users_access")
    @NotEmpty
    private UsersAccess usersAccesses;

    @JsonProperty ("access_groups")
    @NotEmpty
    private AccessGroups accessGroups;


    public UsersAccess getUsersAccesses() {
        return usersAccesses;
    }

    public void setUsersAccesses(UsersAccess usersAccesses) {
        this.usersAccesses = usersAccesses;
    }

    public AccessGroups getAccessGroups() {
        return accessGroups;
    }

    public void setAccessGroups(AccessGroups accessGroups) {
        this.accessGroups = accessGroups;
    }
}
