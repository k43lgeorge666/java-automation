package com.edteam.demo.services;

import com.edteam.demo.models.User;

public interface UserService
{

    User get(String id);

    void remove(String id);
}
