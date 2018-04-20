package com.zg.controller;

import com.zg.entity.User;
import com.zg.service.UserService;
import com.zg.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/login")
    public UserVo doLogin(@RequestParam String username, @RequestParam String password) {
        UserVo userVo = new UserVo();
        User user = userService.doLogin(username);
        userVo.setId(user.getId());
        userVo.setUsername(user.getUsername());
        userVo.setPassworod(user.getPassword());
        return userVo;
    }
}
