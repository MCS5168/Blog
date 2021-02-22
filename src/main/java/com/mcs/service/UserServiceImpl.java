package com.mcs.service;

import com.mcs.dao.UserDao;
import com.mcs.pojo.User;
import com.mcs.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//实现检查用户名密码
@Service
public class UserServiceImpl implements UserService {

    @Autowired  //用在方法上，可直接用在字段上
    private UserDao userRepository;

    @Override
    public User checkUser(String username, String password) {
//        User user = userRepository.findByUsernameAndPassword(username,MD5Utils.code(password));
        User user = userRepository.findByUsernameAndPassword(username,MD5Utils.code(password));
//        MD5Utils.code(password)
        return user;
    }
}
