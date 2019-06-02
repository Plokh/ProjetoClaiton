package br.faj.users.domain;

import java.util.List;

public class AccessGroupApplication {

    private String include;
    private String alter;
    private String delete;
    private List<AccessGroups> accessGroups;
    private List<AccessApplication> accessApplications;

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

    public List<AccessGroups> getAccessGroups() {
        return accessGroups;
    }

    public void setAccessGroups(List<AccessGroups> accessGroups) {
        this.accessGroups = accessGroups;
    }

    public List<AccessApplication> getAccessApplications() {
        return accessApplications;
    }

    public void setAccessApplications(List<AccessApplication> accessApplications) {
        this.accessApplications = accessApplications;
    }
}
