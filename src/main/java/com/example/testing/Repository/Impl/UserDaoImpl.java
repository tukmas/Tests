package com.example.testing.Repository.Impl;

import com.example.testing.Repository.UserDao;
import com.example.testing.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserDaoImpl implements UserDao {
    private ArrayList<User> userList;
    User user1 = new User("Vitaly");
    User user2 = new User("Michael");

    public UserDaoImpl(ArrayList<User> userList) {
        userList.add(user1);
        userList.add(user2);
        this.userList = userList;
    }


    public String addUser(String name) {
        if (userList.contains(name)) {
            throw new RuntimeException("Такой пользователь уже есть");
        }
        userList.add(new User(name));
        return name;
    }
    public String getUserByName(String name) {
        if (!userList.contains(new User(name))) {
            return null;
        }
        return name;
    }

    public String findAllUsers() {
        return userList.toString();
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "userList=" + userList +
                ", user1=" + user1 +
                ", user2=" + user2 +
                '}';
    }

}
