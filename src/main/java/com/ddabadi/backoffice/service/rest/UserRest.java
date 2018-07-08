package com.ddabadi.backoffice.service.rest;

import com.ddabadi.backoffice.domain.UserLogin;
import com.ddabadi.backoffice.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/user")
public class UserRest {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "auth/login")
    UserLogin auth(@RequestBody UserLogin userLogin){

        return userService.findByNameAndPassword(userLogin.getUserName(), userLogin.getPassword());
    }
}
