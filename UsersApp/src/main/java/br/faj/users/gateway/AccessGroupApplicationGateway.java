package br.faj.users.gateway;

import br.faj.users.domain.AccessGroupApplication;
import br.faj.users.domain.AccessGroups;
import br.faj.users.domain.AccessApplication;
import java.util.List;

public interface AccessGroupApplicationGateway {

    AccessGroupApplication findByInclude( String include);
    AccessGroupApplication findByAlter(String alter);
    AccessGroupApplication findByDelete(String delete);
    AccessGroupApplication findByAccessgroups(List<AccessGroups> accessGroups);
    AccessGroupApplication findByAccessapplication(List<AccessApplication> accessApplications);
    List<AccessGroupApplication> findAll();
}
