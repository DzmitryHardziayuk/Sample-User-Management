package com.epam.test.rest;

import com.epam.test.dao.User;
import com.epam.test.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserRestController {

    private static final Logger LOGGER = LogManager.getLogger();

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ExceptionHandler({IllegalArgumentException.class})
    public String incorrectDataError() {
        return "{  \"response\" : \"Incorrect Data Error\" }";
    }

    //curl -v localhost:8088/users
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public @ResponseBody List<User> getUsers() {
        LOGGER.debug("getUsers()");
        return userService.getAllUsers();
    }

    //curl -H "Content-Type: application/json" -X POST -d '{"login":"xyz","password":"xyz"}' -v localhost:8088/user
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Integer addUser(@RequestBody User user) {
        LOGGER.debug("addUser: user = {}", user);
        return userService.addUser(user);
    }

    //curl -X PUT -v localhost:8088/user/2/l1/p1/d1
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void updateUser(@RequestBody User user) {
        LOGGER.debug("updateUser: id = {}", user.getUserId());
        userService.updateUser(user);
    }

    //curl -v localhost:8088/user/login/userLogin1
    @RequestMapping(value = "/user/login/{login}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.FOUND)
    public @ResponseBody User getUserByLogin(@PathVariable(value = "login") String login) {
        LOGGER.debug("getUser: login = {}", login);
        return userService.getUserByLogin(login);
    }

    //curl -v localhost:8088/user/1
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.FOUND)
    public @ResponseBody User getUserById(@PathVariable(value = "id") Integer id) {
        LOGGER.debug("getUserById: login = {}", id);
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteUserById(@PathVariable(value = "id") Integer id) {
        LOGGER.debug("deleteUserById: id = {}", id);
        userService.deleteUser(id);
    }
}
