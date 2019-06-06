package br.faj.users.domain;

import br.faj.users.gateway.mongodb.entity.AccessGroupApplicationEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AccessGroupApplicationMapper {

    public AccessGroupApplication mapParaDomain(AccessGroupApplicationEntity accessGroupApplicationEntity){
        ModelMapper model = new ModelMapper();
        return model.map(accessGroupApplicationEntity,AccessGroupApplication.class);
    }

    public AccessGroupApplicationEntity mapParaEntity(AccessGroupApplication accessGroupApplication){
        ModelMapper model = new ModelMapper();
        return model.map(accessGroupApplication,AccessGroupApplicationEntity.class);
    }
}