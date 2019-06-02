package br.faj.users.gateway.mongodb.entity;

import br.faj.users.domain.UsersAccess;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

public class UsersAccessEntity {

    @Field(value = "login")
    private String login;

    @Field("name")
    private String name;

    @Field("password")
    private String password;

    @Field("cpf")
    private Integer cpf;

    @Field("email")
    private String email;

    @Field("telphone")
    private Integer telphone;

    @Field("celphone")
    private Integer celphone;

    @Field("birthDate")
    private Date birthDate;

    @Field("address1")
    private String address1;

    @Field("address2")
    private String address2;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelphone() {
        return telphone;
    }

    public void setTelphone(Integer telphone) {
        this.telphone = telphone;
    }

    public Integer getCelphone() {
        return celphone;
    }

    public void setCelphone(Integer celphone) {
        this.celphone = celphone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
}