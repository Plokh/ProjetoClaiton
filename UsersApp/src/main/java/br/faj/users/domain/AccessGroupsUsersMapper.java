package br.faj.users.domain;

import br.faj.users.gateway.mongodb.entity.AccessGroupsUsersEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AccessGroupsUsersMapper {

    public AccessGroupsUsers mapParaDomain(AccessGroupsUsersEntity accessGroupsUsersEntity){
        ModelMapper model = new ModelMapper();
        return model.map(accessGroupsUsersEntity,AccessGroupsUsers.class);
    }

    public AccessGroupsUsersEntity mapParaEntity(AccessGroupsUsers accessGroupsUsers){
        ModelMapper model = new ModelMapper();
        return model.map(accessGroupsUsers,AccessGroupsUsersEntity.class);
    }
}