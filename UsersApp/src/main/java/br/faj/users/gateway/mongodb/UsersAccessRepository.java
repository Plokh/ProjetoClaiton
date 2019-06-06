package br.faj.users.gateway.mongodb;

import br.faj.users.gateway.mongodb.entity.UsersAccessEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UsersAccessRepository extends MongoRepository<UsersAccessEntity, String> {

    UsersAccessEntity findByLogin(String login);
    UsersAccessEntity findByName(String name);
    UsersAccessEntity findByPassword(String password);
    UsersAccessEntity findByCpf(Integer cpf);
    UsersAccessEntity findByEmail(String email);
    UsersAccessEntity findByTelphone(Integer telphone);
    UsersAccessEntity findByCelphone(Integer celphone);
    UsersAccessEntity findByBirthdate(String birthDate);
    UsersAccessEntity findByAddress1(String address1);
    UsersAccessEntity findByAddress2(String address2);

}
