package com.example.testing.Repository;

public interface UserDao {
    String addUser(String name);

    String getUserByName(String name);

    String findAllUsers();
}
