package br.faj.users.domain;

import java.util.List;

public class AccessGroupsUsers {

    private List<UsersAccess> usersAccesses;
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
