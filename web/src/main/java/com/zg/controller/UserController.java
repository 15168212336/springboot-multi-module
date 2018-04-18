package com.zg.controller;

import com.zg.service.UserService;
import com.zg.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    public UserVo doLogin(@RequestParam String username, @RequestParam String password) {
        return userService.doLogin(username);
    }
}
