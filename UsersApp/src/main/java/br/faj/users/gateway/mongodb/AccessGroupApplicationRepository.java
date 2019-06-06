package br.faj.users.gateway.mongodb;

import br.faj.users.gateway.mongodb.entity.AccessGroupApplicationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AccessGroupApplicationRepository extends MongoRepository<AccessGroupApplicationEntity, String> {

    AccessGroupApplicationEntity findByInclude( String include);
    AccessGroupApplicationEntity findByAlter(String alter);
    AccessGroupApplicationEntity findByDelete(String delete);
    List<AccessGroupApplicationEntity> findAll();

}
