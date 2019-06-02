package br.faj.users.gateway.mongodb.entity;

import br.faj.users.domain.UsersAccess;
import br.faj.users.domain.AccessGroups;
import br.faj.users.domain.AccessGroupsUsers;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.List;

public class AccessGroupsUsersEntity {

    @Field ("usersAccess")
    private List<UsersAccess> usersAccesses;

    @Field ("accessGroups")
    private List<AccessGroups> accessGroups;

    public List<UsersAccess> getUsersAccesses() {
        return usersAccesses;
    }

    public void setUsersAccesses(List<UsersAccess> usersAccesses) {
        this.usersAccesses = usersAccesses;
    }

    public List<AccessGroups> getAccessGroups() {
        return accessGroups;
    }

    public void setAccessGroups(List<AccessGroups> accessGroups) {
        this.accessGroups = accessGroups;
    }
}
