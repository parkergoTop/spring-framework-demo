package com.parker.spring5.service;

import com.parker.spring5.dao.UserDao;
import com.parker.spring5.dao.UserDaoImpl;

public class UserService {

    private UserDao userDao;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service added...");

        // 原始方式 创建UserDAO对象， 调用UserDaoImpl方法
        //UserDao userDao = new UserDaoImpl();
        //userDao.update();// 多态

        userDao.update();
    }
}
