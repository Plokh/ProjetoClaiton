package br.faj.users.gateway.mongodb.entity;

import br.faj.users.domain.AccessApplication;
import br.faj.users.domain.ScLog;
import br.faj.users.domain.UsersAccess;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.List;

@Document
public class ScLogEntity {

    @Field(value = "id")
    private Integer id;

    @Field("dateTime")
    private String dateTime;

    @Field("event")
    private String event;

    @Field("dataText")
    private String dataText;

    @DBRef
    private List<UsersAccess> usersAccesses;

    @DBRef
    private List<AccessApplication> accessApplications;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDataText() {
        return dataText;
    }

    public void setDataText(String dataText) {
        this.dataText = dataText;
    }

    public List<UsersAccess> getUsersAccesses() {
        return usersAccesses;
    }

    public void setUsersAccesses(List<UsersAccess> usersAccesses) {
        this.usersAccesses = usersAccesses;
    }

    public List<AccessApplication> getAccessApplications() {
        return accessApplications;
    }

    public void setAccessApplications(List<AccessApplication> accessApplications) {
        this.accessApplications = accessApplications;
    }
}
