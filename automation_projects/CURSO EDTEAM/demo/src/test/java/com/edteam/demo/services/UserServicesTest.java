package com.edteam.demo.services;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServicesTest
{
    @InjectMocks
    private UserService service;
    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void getUserTest()
    {

    }
}
