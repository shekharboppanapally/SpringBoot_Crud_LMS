package com.tc.lms.controller;

import com.tc.lms.dto.SaveBookDTO;
import com.tc.lms.dto.SaveUserDTO;
import com.tc.lms.facade.SaveBookFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveBookController {
    @Autowired
    private SaveBookFacade saveBookFacade;
    @PostMapping("/saveBook")
    public SaveBookDTO saveBook(@RequestBody SaveBookDTO saveBookDTO){
        return saveBookFacade.saveBook(saveBookDTO);
    }
}
