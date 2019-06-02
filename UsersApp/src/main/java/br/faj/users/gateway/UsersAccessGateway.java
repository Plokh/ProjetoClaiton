package br.faj.users.gateway;

import br.faj.users.domain.UsersAccess;

public interface UsersAccessGateway {

    UsersAccess getByLogin(String login);
    UsersAccess findByName(String name);
    UsersAccess findByPassword(String password);
    UsersAccess findByCpf(Integer cpf);
    UsersAccess findByEmail(String email);
    UsersAccess findByTelphone(Integer telphone);
    UsersAccess findByCelphone(Integer celphone);
    UsersAccess findByBirthdate(String birthDate);
    UsersAccess findByAddress1(String address1);
    UsersAccess findByAddress2(String address2);

}
