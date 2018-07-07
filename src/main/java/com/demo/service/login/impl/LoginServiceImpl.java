package com.demo.service.login.impl;

import com.demo.dao.LoginDao;
import com.demo.dao.UserDao;
import com.demo.model.UserDomain;
import com.demo.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "LoginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserDao userDao;

    @Override
    public String login(UserDomain user) {
        return userDao.searchByUserNameAndPassWord(user);
    }

    @Override
    public String register(UserDomain user) {
        if (Boolean.valueOf(userDao.searchByUserName(user)))
            userDao.insert(user);
        return userDao.searchByUserName(user);
    }
}
