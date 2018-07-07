package com.demo.dao;

import com.demo.model.UserDomain;

import java.util.List;

public interface UserDao {

    String searchByUserName(UserDomain user);
    String searchByUserNameAndPassWord(UserDomain user);
    String insert(UserDomain user);

    List<UserDomain> selectUsers();
}