package br.faj.users.domain;

import br.faj.users.gateway.mongodb.entity.UsersAccessEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UsersAccessMapper {

    public UsersAccess mapParaDomain(UsersAccessEntity usersAccessEntity){
        ModelMapper model = new ModelMapper();
        return model.map(usersAccessEntity,UsersAccess.class);
    }

    public UsersAccessEntity mapParaEntity(UsersAccess usersAccess){
        ModelMapper model = new ModelMapper();
        return model.map(usersAccess,UsersAccessEntity.class);
    }
}