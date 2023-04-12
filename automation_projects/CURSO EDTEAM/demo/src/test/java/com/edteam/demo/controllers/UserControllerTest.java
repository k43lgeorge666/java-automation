package com.edteam.demo.controllers;

import com.edteam.demo.models.User;
import com.edteam.demo.services.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest
{
    @Mock
    UserService service;
    @InjectMocks
    UserController controller;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void getUserTest()
    {
        User user = controller.get(null, "31");
        verify(service).get("31");
    }
    @Test
    public void getUserValues()
    {
        User userMock = new User();
        userMock.setEmail("test1@test.com");
        userMock.setId("31");
        userMock.setName("test");
        userMock.setPassword("Admin@12345");

        //esto es cuando queremos verificar un id especifico
        //when(service.get("31")).thenReturn(userMock);

        //esto es cuando queremos verificar que nos devuelva cualquier id
        when(service.get(any())).thenReturn(userMock);

        User user = controller.get(null, "31");
        verify(service).get("31");
        Assert.assertNotNull(user);
        Assert.assertEquals("31",user.getId());
    }
    @Test
    public void getUserTestShould_show_error_with_null_values()
    {
        when(service.get(null)).thenThrow(new IllegalArgumentException("ID should not be null"));
        User user = controller.get(null,null);
    }
    @Test
    public void RemoveUser()
    {
        controller.remove(null,"12");
        verify(service).remove("12");
    }
    @Test
    public void RemoveManyUsers()
    {
        String[] ids = {"31","11","22"};
        controller.removeManyUsers(null, ids);
        verify(service, times(3)).remove(any());
    }
}

