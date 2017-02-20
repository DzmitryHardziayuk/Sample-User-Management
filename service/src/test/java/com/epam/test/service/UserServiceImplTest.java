package com.epam.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by mentor on 20.2.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:service-test.xml"})
public class UserServiceImplTest {

    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void getAllUsers() throws Exception {

    }

    @Test
    public void getUserById() throws Exception {

    }

    @Test
    public void getUserByLogin() throws Exception {

    }

    @Test
    public void addUser() throws Exception {

    }

    @Test
    public void updateUser() throws Exception {

    }

    @Test
    public void deleteUser() throws Exception {

    }

}