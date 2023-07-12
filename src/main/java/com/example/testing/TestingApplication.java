package com.example.testing;

import org.springframework.boot.SpringApplication;

public class TestingApplication {

    public static void main(String[] args) {
        User user = new User("Сергей", "tukma", "tukmachev.18@yandex.ru");
        System.out.println(user);
    }

}
