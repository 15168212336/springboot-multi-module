package com.zg.service.impl;

import com.zg.dao.UserDao;
import com.zg.entity.User;
import com.zg.service.UserService;
import com.zg.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User doLogin(String userName) {
        return  userDao.getUserByUserName(userName);
    }
}
