package com.zg.dao.impl;

import com.zg.dao.UserDao;
import com.zg.entity.User;
import com.zg.vo.UserVo;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    EntityManager entityManager;
    @Override
    public User getUserByUserName(String userName) {
        String sql = "from User where userName = :username";
        Map<String, String> params = new HashMap<>();
        params.put("username", userName);
        Session session = entityManager.unwrap(Session.class);
        List<User> list = session.createQuery(sql).setParameter("username",params.get("username")).list();
//        UserVo userVo = new UserVo(userName,"123456");
        return list.get(0);
    }
}
