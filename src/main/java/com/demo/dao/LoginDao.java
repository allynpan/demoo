package com.demo.dao;

import com.demo.model.UserDomain;

public interface LoginDao {
    String login(UserDomain user);
    String register(UserDomain user);
}
