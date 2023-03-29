package com.tc.lms.facade;

import com.tc.lms.dto.SaveUserDTO;
import com.tc.lms.model.User;
import com.tc.lms.service.SaveUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveUserFacadeImpl implements SaveUserFacade{
    @Autowired
    private SaveUserService saveUserService;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public SaveUserDTO saveUser(SaveUserDTO saveUserDTO) {
        User user=modelMapper.map(saveUserDTO, User.class);
        user=saveUserService.saveUser(user);
        saveUserDTO=modelMapper.map(user,SaveUserDTO.class);
        return saveUserDTO;
    }
}
