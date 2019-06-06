package br.faj.users.domain;

import br.faj.users.gateway.mongodb.entity.AccessApplicationEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AccessApplicationMapper {

    public AccessApplication mapParaDomain(AccessApplicationEntity accessApplicationEntity){
        ModelMapper model = new ModelMapper();
        return model.map(accessApplicationEntity,AccessApplication.class);
    }

    public AccessApplicationEntity mapParaEntity(AccessApplication accessApplication){
        ModelMapper model = new ModelMapper();
        return model.map(accessApplication,AccessApplicationEntity.class);
    }
}