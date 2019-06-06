package br.faj.users.gateway;

import br.faj.users.domain.AccessGroupApplication;
import java.util.List;

public interface AccessGroupApplicationGateway {

    AccessGroupApplication findByInclude( String include);
    AccessGroupApplication findByAlter(String alter);
    AccessGroupApplication findByDelete(String delete);
    List <AccessGroupApplication> findAll();

    AccessGroupApplication Save (AccessGroupApplication accessGroupApplicationSave);
}
