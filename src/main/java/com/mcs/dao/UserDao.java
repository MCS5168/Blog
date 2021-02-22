package com.mcs.dao;

import com.mcs.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

//使用spring boot里的JPA
public interface UserDao extends JpaRepository<User,Long> {//操作的对象user,long类型

    User findByUsernameAndPassword(String username, String password); //定义方法，遵循这个命名规则，根据用户名和密码查询数据库，继承JPA直接有方法
}