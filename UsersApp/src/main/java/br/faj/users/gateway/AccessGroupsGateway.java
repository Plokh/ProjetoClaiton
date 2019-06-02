package br.faj.users.gateway;

import br.faj.users.domain.AccessGroups;

public interface AccessGroupsGateway {

    AccessGroups getById (Integer id);
    AccessGroups findByDescription (String description);
}
