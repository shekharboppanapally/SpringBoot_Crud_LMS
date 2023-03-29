package com.tc.lms.service;

import com.tc.lms.model.User;

import java.util.List;
import java.util.Optional;

public interface GetUsersService {
    public List<User> getAllUsers();
    public Optional<User> getUserById(int id);
}
