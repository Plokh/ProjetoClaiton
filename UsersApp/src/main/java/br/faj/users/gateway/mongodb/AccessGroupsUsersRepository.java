package br.faj.users.gateway.mongodb;


import br.faj.users.gateway.mongodb.entity.UsersAccessEntity;
import br.faj.users.gateway.mongodb.entity.AccessGroupsEntity;
import br.faj.users.gateway.mongodb.entity.AccessGroupsUsersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AccessGroupsUsersRepository {

    AccessGroupsUsersEntity findByUsersaccess(List<UsersAccessEntity> usersAccesses);
    AccessGroupsUsersEntity findByAccessgroups(List<AccessGroupsEntity> accessGroups);
    List<AccessGroupsUsersEntity> findAll();
}
