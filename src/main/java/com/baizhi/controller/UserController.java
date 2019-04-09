package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("selectAllUser")
    public List<User> selectAllUse(){
        System.out.println("selectAllUser");
        List<User> users = userService.selectAllUser();
        System.out.println("users的size："+ users.size());
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }


}
