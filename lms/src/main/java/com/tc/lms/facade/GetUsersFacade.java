package com.tc.lms.facade;

import com.tc.lms.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface GetUsersFacade {
    public List<UserDTO> getAllUsers();

    public UserDTO getUserById(int id);
}
