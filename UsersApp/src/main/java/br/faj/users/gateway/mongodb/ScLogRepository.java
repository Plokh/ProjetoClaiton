package br.faj.users.gateway.mongodb;

import br.faj.users.gateway.mongodb.entity.UsersAccessEntity;
import br.faj.users.gateway.mongodb.entity.ScLogEntity;
import br.faj.users.gateway.mongodb.entity.AccessApplicationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ScLogRepository extends MongoRepository<ScLogEntity, String> {

    ScLogEntity getById(Integer id);
    ScLogEntity findByIdDatetime(String dateTime);
    ScLogEntity findByEvent(String event);
    ScLogEntity findByDatatext(String dataText);
    ScLogEntity findByUsersaccess(List<UsersAccessEntity> usersAccess);
    ScLogEntity findByAccessapplication(List<AccessApplicationEntity> accessApplications);
    List<ScLogEntity> findAll();
}
