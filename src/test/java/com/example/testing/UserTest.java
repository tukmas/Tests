package com.example.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private static String name;
    private static String login;
    private static String email;
    static User user;

    @BeforeAll
    private static void whetherSettingDataWhenCreatingAnObject() {
        name = "Сергей";
        login = "tukma";
        email = "tukmachev.18@yandex.ru";
//        user = new User();
    }

    @Test
    void checkUserName() {
        Assertions.assertEquals("Сергей", user.checkUserName("Сергей"));
    }

    @Test
    void checkUserLogin() {
        Assertions.assertEquals("tukma", user.checkUserLogin("tukma"));
    }

    @Test
    void checkUserEmail() {
        Assertions.assertEquals("tukmachev.18@yandex.ru", user.checkUserEmail("tukmachev.18@yandex.ru"));
    }

    @Test
    void checkUserNameNull() {
        Assertions.assertNotNull(user.checkUserName("Сергей"));
    }

    @Test
    void checkUserLoginNull() {
        Assertions.assertNotNull(user.checkUserLogin("tukma"));
    }

    @Test
    void checkUserEmailNull() {
        Assertions.assertNotNull(user.checkUserEmail("tukmachev.18@yandex.ru"));
    }

    @Test
    void getEmail() {
        Assertions.assertTrue(email.contains("@") && email.contains("."));
    }
    @Test
    void checkUserNameLogin() {

        Assertions.assertNotEquals(user.checkUserName("Сергей"), user.checkUserLogin("tukma"));
    }
}