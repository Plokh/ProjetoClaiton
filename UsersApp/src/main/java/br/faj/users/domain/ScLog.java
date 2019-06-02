package br.faj.users.domain;

import java.util.Date;
import java.util.List;

public class ScLog {

    private Integer id;
    private Date dateTime;
    private String event;
    private String dataText;
    private List<UsersAccess> usersAccesses;
    private List<AccessApplication> accessApplications;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
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
