package com.epam.test.service;

import com.epam.test.dao.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mentor on 20.2.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:service-test.xml"})
@Transactional
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void getAllUsers() throws Exception {
        List<User> users = userService.getAllUsers();
        Assert.assertEquals("", 2, users.size());
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