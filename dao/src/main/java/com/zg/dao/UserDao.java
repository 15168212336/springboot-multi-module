package com.zg.dao;

import com.zg.entity.User;

public interface UserDao {
    public User getUserByUserName(String userName);
}
