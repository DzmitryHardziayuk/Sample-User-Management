package com.epam.test.model;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

    public User getUserById(Integer userId);

    public Integer addUser(User user);

    public void updateUser(User user);

    public void deleteUser(Integer userId);

}
