package br.faj.users.gateway;

import br.faj.users.domain.AccessApplication;

public interface AccessApplicationGateway {

    AccessApplication getByNameapplication(String nameApplication);
    AccessApplication findByType(String type);

}
