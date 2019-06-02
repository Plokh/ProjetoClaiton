package br.faj.users.gateway.mongodb.entity;

import br.faj.users.domain.AccessGroups;
import org.springframework.data.mongodb.core.mapping.Field;

public class AccessGroupsEntity {

    @Field (value = "id")
    private Integer id;

    @Field ("description")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
