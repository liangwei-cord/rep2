package com.itheima.dao;


import org.junit.Test;
public class UserDaoTest {


    @Test
    public void findUser() {
        UserDao userDao = new UserDao();
        userDao.findUser();
    }
}

