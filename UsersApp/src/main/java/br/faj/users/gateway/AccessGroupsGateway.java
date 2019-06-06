package br.faj.users.gateway;

import br.faj.users.domain.AccessGroups;

public interface AccessGroupsGateway {

    AccessGroups findById (Integer id);
    AccessGroups findByDescription (String description);

    AccessGroups save (AccessGroups accessGroupsSave);
}
