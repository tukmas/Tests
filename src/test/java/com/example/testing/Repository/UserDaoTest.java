package com.example.testing.Repository;

import com.example.testing.Repository.Impl.UserDaoImpl;
import com.example.testing.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class UserDaoTest {

    private final UserDaoImpl out = new UserDaoImpl(new ArrayList<User>());


    @Test
    void shouldReturnTrueIfUserExist() {
        User userCheck = new User("Vitaly");
        String result = out.getUserByName(userCheck.getName());
        Assertions.assertTrue(result.contains(userCheck.getName()));
    }

    @Test
    void ShouldReturnTrueIfUserIsAbsent() {
        User userCheck = new User("Ivan");
        String result = out.getUserByName(userCheck.getName());
        Assertions.assertNull(result);
    }

}