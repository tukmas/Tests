package com.example.testing;

import com.example.testing.Repository.UserDao;
import org.springframework.boot.SpringApplication;

public class TestingApplication {

    public static void main(String[] args) {
        User user = new User("Сергей");
        System.out.println(user.checkUserName("Сергей"));
        System.out.println(user.checkUserLogin("tukma"));
        System.out.println(user.checkUserEmail("tukmachev.18@yandex.ru"));
        System.out.println(user);
    }

}
