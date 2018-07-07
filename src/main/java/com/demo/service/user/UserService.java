package com.demo.service.user;

import com.demo.model.UserDomain;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    String addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}