package com.tc.lms.service;

import com.tc.lms.model.User;
import com.tc.lms.repository.SaveUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveUserServiceImpl implements SaveUserService{
    @Autowired
    private SaveUserRepository saveUserRepository;
    @Override
    public User saveUser(User user) {
        return saveUserRepository.save(user);
    }
}
