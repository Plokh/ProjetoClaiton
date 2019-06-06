package br.faj.users.gateway;

import br.faj.users.domain.AccessApplication;

public interface AccessApplicationGateway {

    AccessApplication findByNameapplication(String nameApplication);
    AccessApplication findByType(String type);

    AccessApplication save (AccessApplication accessApplicationSave);
}
