package br.faj.users.gateway;

import br.faj.users.domain.AccessGroupsUsers;
import br.faj.users.domain.UsersAccess;
import br.faj.users.domain.AccessGroups;
import java.util.List;

public interface AccessGroupsUsersGateway {

    AccessGroupsUsers findByUsersaccess(List<UsersAccess> usersAccesses);
    AccessGroupsUsers findByAccessgroups(List<AccessGroups> accessGroups);
}
