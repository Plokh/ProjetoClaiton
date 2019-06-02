package br.faj.users.gateway.mongodb.entity;

import br.faj.users.domain.AccessApplication;
import org.springframework.data.mongodb.core.mapping.Field;

public class AccessApplicationEntity {

    @Field (value = "nameApplication")
    private String nameApplication;

    @Field ("type")
    private String type;


}
