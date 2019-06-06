package br.faj.users.gateway.mongodb;

import br.faj.users.gateway.mongodb.entity.ScLogEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ScLogRepository extends MongoRepository<ScLogEntity, String> {

    ScLogEntity findById(Integer id);
    ScLogEntity findByIdDatetime(String dateTime);
    ScLogEntity findByEvent(String event);
    ScLogEntity findByDatatext(String dataText);
    List<ScLogEntity> findAll();
}
