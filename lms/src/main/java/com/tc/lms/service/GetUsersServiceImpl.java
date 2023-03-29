package com.tc.lms.service;

import com.tc.lms.model.User;
import com.tc.lms.repository.GetUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetUsersServiceImpl implements GetUsersService{
    @Autowired
    private GetUsersRepository getUsersRepository;
    @Override
    public List<User> getAllUsers() {
        return getUsersRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return getUsersRepository.findById(id);
    }
}
