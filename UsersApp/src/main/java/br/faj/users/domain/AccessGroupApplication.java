package br.faj.users.domain;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessGroupApplication {

    @JsonProperty ("include")
    private String include;

    @JsonProperty ("alter")
    private String alter;

    @JsonProperty ("delete")
    private String delete;

    @JsonProperty ("access_groups")
    @NotEmpty
    private AccessGroups accessGroups;

    @JsonProperty ("access_application")
    @NotEmpty
    private AccessApplication accessApplications;

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public AccessGroups getAccessGroups() {
        return accessGroups;
    }

    public void setAccessGroups(AccessGroups accessGroups) {
        this.accessGroups = accessGroups;
    }

    public AccessApplication getAccessApplications() {
        return accessApplications;
    }

    public void setAccessApplications(AccessApplication accessApplications) {
        this.accessApplications = accessApplications;
    }
}
