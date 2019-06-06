package br.faj.users.gateway.mongodb.entity;

import br.faj.users.domain.AccessApplication;
import br.faj.users.domain.AccessGroups;
import br.faj.users.domain.AccessGroupApplication;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.List;

@Document(collection = "users")
public class AccessGroupApplicationEntity {

    @Field ("include")
    private String include;

    @Field ("alter")
    private String alter;

    @Field ("delete")
    private String delete;

    @DBRef
    private List<AccessApplication> accessApplications;

    @DBRef
    private List<AccessGroups> accessGroups;

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

    public List<AccessApplication> getAccessApplications() {
        return accessApplications;
    }

    public void setAccessApplications(List<AccessApplication> accessApplications) {
        this.accessApplications = accessApplications;
    }

    public List<AccessGroups> getAccessGroups() {
        return accessGroups;
    }

    public void setAccessGroups(List<AccessGroups> accessGroups) {
        this.accessGroups = accessGroups;
    }
}
