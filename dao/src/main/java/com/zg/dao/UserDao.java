package com.zg.dao;

import com.zg.vo.UserVo;

public interface UserDao {
    public UserVo getUserByUserName(String userName);
}
