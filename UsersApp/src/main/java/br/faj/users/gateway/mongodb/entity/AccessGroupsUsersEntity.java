package br.faj.users.gateway.mongodb.entity;

import br.faj.users.domain.UsersAccess;
import br.faj.users.domain.AccessGroups;
import br.faj.users.domain.AccessGroupsUsers;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.List;

@Document
public class AccessGroupsUsersEntity {

    @DBRef
    private List<UsersAccess> usersAccesses;

    @DBRef
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
