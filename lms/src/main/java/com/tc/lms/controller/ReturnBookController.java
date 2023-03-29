package com.tc.lms.controller;

import com.tc.lms.dto.ReturnBookDTO;
import com.tc.lms.facade.ReturnBookFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnBookController {
    @Autowired
    private ReturnBookFacade returnBookFacade;
    @PutMapping("/returnBook")
    public ReturnBookDTO returnBook(@RequestBody ReturnBookDTO returnBookDTO){
        return returnBookFacade.returnBook(returnBookDTO);
    }
}
