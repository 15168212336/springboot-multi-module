package com.zg.dao.impl;

import com.zg.dao.UserDao;
import com.zg.vo.UserVo;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public UserVo getUserByUserName(String userName) {
        UserVo userVo = new UserVo(userName,"123456");
        return userVo;
    }
}
