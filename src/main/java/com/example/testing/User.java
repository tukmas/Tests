package com.example.testing;


import java.util.Objects;

public class User {
    private String name;
    private String login;
    private String email;

    public User(String name, String login, String email) {
        this.name = name;
        this.login = login;
        this.email = email;
    }
    public User() {
    }


    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String checkUserName(String name) {
        return name;
    }
    public String checkUserLogin(String login) {
        return login;
    }
    public String checkUserEmail(String email) {
        return email;
    }

}