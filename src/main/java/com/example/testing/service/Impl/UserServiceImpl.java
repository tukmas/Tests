package com.example.testing.service.Impl;


import com.example.testing.Repository.UserDao;
import com.example.testing.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(String name) {
        return userDao.getUserByName(name)!=null;
    }
}
