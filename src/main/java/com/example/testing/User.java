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

    public void setName(String name) throws FormatterClosedException  {
        if (this.name != null) {
        this.name = name;
    }
    else throw new FormatterClosedException();
    }

    public void setLogin(String login) throws FormatterClosedException {
        if (this.login != null) {
        this.login = login;
    }
    else throw new FormatterClosedException();
    }

    public void setEmail(String email) throws FormatterClosedException {
        if (this.email != null) {
        this.email = email;
        }
    else throw new FormatterClosedException();
    }

}