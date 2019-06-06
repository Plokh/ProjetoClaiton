package br.faj.users.domain;

import br.faj.users.gateway.mongodb.entity.ScLogEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ScLogMapper {

    public ScLog mapParaDomain(ScLogEntity scLogEntity){
        ModelMapper model = new ModelMapper();
        return model.map(scLogEntity,ScLog.class);
    }

    public ScLogEntity mapParaEntity(ScLog scLog){
        ModelMapper model = new ModelMapper();
        return model.map(scLog,ScLogEntity.class);
    }
}