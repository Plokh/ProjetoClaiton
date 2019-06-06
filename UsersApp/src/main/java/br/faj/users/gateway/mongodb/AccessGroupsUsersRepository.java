package br.faj.users.gateway.mongodb;


import br.faj.users.gateway.mongodb.entity.AccessGroupsUsersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AccessGroupsUsersRepository extends MongoRepository<AccessGroupsUsersEntity, String>{

    List<AccessGroupsUsersEntity> findAll();
}
