package com.yhw.login.bean;

import java.util.Date;


public class User {
    private int id;
    private String username;
    private String content;
    private String date;

    public User() {
    }

    public User(int id, String username, String content, String date) {
        this.id = id;
        this.username = username;
        this.content = content;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
