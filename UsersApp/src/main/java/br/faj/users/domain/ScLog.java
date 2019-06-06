package br.faj.users.domain;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScLog {

    @JsonProperty ("id")
    @NotEmpty
    private Integer id;

    @JsonProperty ("date_time")
    @NotEmpty
    private Date dateTime;

    @JsonProperty ("event")
    @NotEmpty
    private String event;

    @JsonProperty ("data_text")
    @NotEmpty
    private String dataText;

    @JsonProperty ("users_access")
    @NotEmpty
    private UsersAccess usersAccesses;

    @JsonProperty ("access_application")
    @NotEmpty
    private AccessApplication accessApplications;

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

    public UsersAccess getUsersAccesses() {
        return usersAccesses;
    }

    public void setUsersAccesses(UsersAccess usersAccesses) {
        this.usersAccesses = usersAccesses;
    }

    public AccessApplication getAccessApplications() {
        return accessApplications;
    }

    public void setAccessApplications(AccessApplication accessApplications) {
        this.accessApplications = accessApplications;
    }
}
