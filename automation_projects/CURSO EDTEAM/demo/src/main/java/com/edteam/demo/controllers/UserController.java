package com.edteam.demo.controllers;

import com.edteam.demo.models.User;
import com.edteam.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpHeaders;
import java.util.Arrays;

@RestController
@RequestMapping("api/user")
public class UserController
{

    private UserService service;
    @Autowired
    public void UserController(UserService service)
    {
        this.service = service;
    }
    @RequestMapping("/{id}")
    User get(@RequestHeader HttpHeaders headers, @PathVariable String id)
    {
        return service.get(id);
    }

    void remove(@RequestHeader HttpHeaders headers, @PathVariable String id)
    {
        service.remove(id);
    }
    void removeManyUsers(@RequestHeader HttpHeaders headers, @PathVariable String[] ids)
    {
        Arrays.stream(ids).forEach(id -> service.remove(id));
    }

}
