package br.faj.users.domain;

import br.faj.users.gateway.mongodb.entity.AccessGroupsEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AccessGroupsMapper {

    public AccessGroups mapParaDomain(AccessGroupsEntity accessGroupsEntity){
        ModelMapper model = new ModelMapper();
        return model.map(accessGroupsEntity,AccessGroups.class);
    }

    public AccessGroupsEntity mapParaEntity(AccessGroups accessGroups){
        ModelMapper model = new ModelMapper();
        return model.map(accessGroups,AccessGroupsEntity.class);
    }
}