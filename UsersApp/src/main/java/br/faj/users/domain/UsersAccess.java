package br.faj.users.domain;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersAccess {

    @JsonProperty ("login")
    @NotEmpty
    private String login;

    @JsonProperty ("name")
    @NotEmpty
    private String name;

    @JsonProperty ("password")
    @NotEmpty
    private String password;

    @JsonProperty ("cpf")
    @NotNull
    private Integer cpf;

    @JsonProperty ("email")
    @NotEmpty
    private String email;

    @JsonProperty ("telphone")
    @NotNull
    private Integer telphone;

    @JsonProperty ("celphone")
    @NotNull
    private Integer celphone;

    @JsonProperty ("birth_date")
    @NotNull
    private LocalDate birthDate;

    @JsonProperty ("address1")
    @NotEmpty
    private String address1;

    @JsonProperty ("address2")
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
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
