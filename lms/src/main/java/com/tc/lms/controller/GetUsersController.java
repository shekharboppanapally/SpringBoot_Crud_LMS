package com.tc.lms.controller;

import com.tc.lms.dto.UserDTO;
import com.tc.lms.facade.GetUsersFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetUsersController {
    @Autowired
    private GetUsersFacade getUsersFacade;
    @GetMapping("/allUsers")
    public List<UserDTO> getAllUsers(){
        return getUsersFacade.getAllUsers();
    }
    @GetMapping("/user/{id}")
    public UserDTO getUserById(@PathVariable int id){
        return getUsersFacade.getUserById(id);
    }

}
