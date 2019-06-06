package br.faj.users.gateway;

import br.faj.users.domain.AccessGroupsUsers;
import java.util.List;

public interface AccessGroupsUsersGateway {

    List<AccessGroupsUsers> findAll();

    AccessGroupsUsers save (AccessGroupsUsers accessGroupsUsersSave);
}
