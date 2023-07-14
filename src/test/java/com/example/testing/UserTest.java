package com.example.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class UserTest {
    User user;
    @BeforeEach
    public void createUser() {
        user = new User("Сергей", "tukma", "tukmachev.18@yandex.ru");
    }

    @Test
    void setName()  {
        user.setName("Виталий");
        Assertions.assertEquals("Виталий", user.getName());
    }
    @Test
    void setLogin() {
        user.setLogin("tukmas");
        Assertions.assertEquals("tukmas", user.getLogin());
    }

    @Test
    void setEmail() {
        user.setEmail("Ivanov.18@yandex.ru");
        Assertions.assertEquals("Ivanov.18@yandex.ru", user.getEmail());
    }
    @Test
    void checkEmail() {
        Assertions.assertTrue(user.getEmail().contains("@"));
        Assertions.assertTrue(user.getEmail().contains("."));
    }

    @Test
    void checkLoginAndEmail() {
        Assertions.assertNotEquals(user.getEmail(), user.getLogin());
    }
}