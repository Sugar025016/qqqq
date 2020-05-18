package com.example.booking.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class UserUpdataRequest {
//    @NotEmpty(message = "id不能為空")
    private Integer id;
    @NotEmpty(message = "account不能為空")
    private String account;
    @NotEmpty(message = "password不能為空")
    private String password;
    @NotEmpty(message = "name不能為空")
    private String name;
    @NotNull(message = "number不能為空")
    @Past(message = "时间有误")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    @NotEmpty(message = "number不能為空")
    @Pattern(regexp = "^09\\d{8}$", message = "手機號格式有誤")
    private String number;
    @NotEmpty(message = "email不能為空")
    @Email
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
