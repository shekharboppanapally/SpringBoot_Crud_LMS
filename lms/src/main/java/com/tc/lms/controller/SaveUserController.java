package com.tc.lms.controller;

import com.tc.lms.dto.SaveUserDTO;
import com.tc.lms.facade.SaveUserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveUserController {
    @Autowired
    private SaveUserFacade saveUserFacade;
    @PostMapping("/saveUser")
    public SaveUserDTO saveUser(@RequestBody SaveUserDTO saveUserDTO){
        return saveUserFacade.saveUser(saveUserDTO);

    }
}
