package com.yao.model;
/*
 * @author Jack
 * @date 2023/1/2
 * */

public class User {
    private Integer id;
    private String name;
    private String password;
    private String mail;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User(Integer id, String name, String password, String mail, String description) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.description = description;
    }
}
