package com.demo.service.login;

import com.demo.model.UserDomain;


public interface LoginService {
    String login(UserDomain user);

    String register(UserDomain user);
}
