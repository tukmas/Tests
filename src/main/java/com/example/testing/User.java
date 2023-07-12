package com.example.testing;


import java.util.FormatterClosedException;

public class User {
    private String name;
    private String login;
    private String email;

    public User(String name, String login, String email) {
        checkEmail(email);
        checkLoginAndEmail(login, email);
        this.name = name;
        this.login = login;
        this.email = email;
    }
    public User() {
    }

    public void checkEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Некорректный формат почты");
            throw new FormatterClosedException();
        }
    }

    public void checkLoginAndEmail(String login, String email) {
        if (login.equals(email)) {
            System.out.println("Логин и почта не должны быть равны");
            throw new FormatterClosedException();
        }
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

    public void setName(String name) {
        if (name != null) {
        this.name = name;
    }
        throw new FormatterClosedException();
    }

    public void setLogin(String login) {
        if (login != null) {
        this.login = login;
    }
        throw new FormatterClosedException();
    }

    public void setEmail(String email) {
        if (email != null) {
        this.email = email;
        }
        throw new FormatterClosedException();
    }

}