package com.mcs.service;

import com.mcs.pojo.User;

public interface UserService {

    User checkUser(String username, String password);   //检查用户名和密码
}
