package com.example.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.FormatterClosedException;


class UserTest {
    User user;
    @BeforeEach
    public void createUser() {
        user = new User("Сергей@", "tukma", "tukmachev.18@yandex.ru");
    }
    @Test
    void setName()  {
        user.setName("Виталий");
        Assertions.assertEquals("Виталий", user.getName());
    }
    @Test
    public void whenNullIsPassedToTheNameAnExceptionIsThrown() {
        Assertions.assertThrows(
                FormatterClosedException.class,
                () -> new User(null, "tukma", "tukmachev.18yandex.ru")
        );
    }
    @Test
    void setLogin() {
        user.setLogin("tukmas");
        Assertions.assertEquals("tukmas", user.getLogin());
    }
    @Test
    public void whenNullIsPassedToLoginAnExceptionIsThrown() {
        Assertions.assertThrows(
                FormatterClosedException.class,
                () -> new User("Сергей", null, "tukmachev.18yandex.ru")
        );
    }
    @Test
    void setEmail() {
        user.setEmail("Ivanov.18@yandex.ru");
        Assertions.assertEquals("Ivanov.18@yandex.ru", user.getEmail());
    }
    @Test
    public void when_incorrect_email_passed_then_exception_is_thrown() {
        Assertions.assertThrows(
                FormatterClosedException.class,
                () -> new User("Сергей", "tukma", "tukmachev.18yandex.ru")
        );
    }
    @Test
    public void when_incorrect_email_passed_then_exception_is_thrown1() {
        Assertions.assertThrows(
                FormatterClosedException.class,
                () -> new User("Сергей", "tukma", "tukmachev@18yandexru")
        );
    }
    @Test
    public void when_correct_email_passed_then_exception_doesnt_throw() {
        Assertions.assertDoesNotThrow(
                () -> new User("Сергей", "tukma", "tukmachev.18@yandex.ru")
        );
    }

    @Test
    public void ShouldReturnSuccessMessageIfLoginContainsPointandAt() {
        String notValidLogin = "tukma";
        Assertions.assertThrows(FormatterClosedException.class, (() -> user.checkEmail(notValidLogin)));
    }

    @Test
    public void ShouldReturnSuccessMessageIfLoginAndEmailAreNotEquals() {
        String login = "tukmachev.18@yandex.ru";
        String email = "tukmachev.18@yandex.ru";
        Assertions.assertThrows(FormatterClosedException.class, (() -> user.checkLoginAndEmail(login, email)));
    }
}