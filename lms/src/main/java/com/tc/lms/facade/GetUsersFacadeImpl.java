package com.tc.lms.facade;

import com.tc.lms.dto.UserDTO;
import com.tc.lms.model.User;
import com.tc.lms.service.GetUsersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Component
public class GetUsersFacadeImpl implements GetUsersFacade{
    @Autowired
    private GetUsersService getUsersService;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO ConvertEntityToDto(User user){
        UserDTO userDTO = new UserDTO();
        userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }
    @Override
    public List<UserDTO> getAllUsers() {
        return getUsersService.getAllUsers()
                .stream()
                .map(this::ConvertEntityToDto )
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(int id) {
        Optional<User> user=getUsersService.getUserById(id);
        return modelMapper.map(user, UserDTO.class);
    }
}
