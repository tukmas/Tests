package com.example.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UserTest {
    private final User user = new User("Сергей", "tukma", "tukmachev.18@yandex.ru");

    @Test
    void checkUser() {
        Assertions.assertEquals("Сергей", user.getName());
        Assertions.assertEquals("tukma", user.getLogin());
        Assertions.assertEquals("tukmachev.18@yandex.ru", user.getEmail());
    }
    @Test
    void checkUserNull() {
        Assertions.assertNotNull(user.getName());
        Assertions.assertNotNull(user.getLogin());
        Assertions.assertNotNull(user.getEmail());
    }
    @Test
    void checkEmail() {
        Assertions.assertTrue(user.getEmail().contains("@"));
        Assertions.assertTrue(user.getEmail().contains("."));
    }
    @Test
    void checkUserNameLogin() {
        Assertions.assertNotEquals(user.getEmail(), user.getLogin());
    }

}