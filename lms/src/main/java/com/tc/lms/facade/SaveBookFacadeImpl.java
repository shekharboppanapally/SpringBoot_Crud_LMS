package com.tc.lms.facade;

import com.tc.lms.dto.SaveBookDTO;
import com.tc.lms.model.Book;
import com.tc.lms.service.SaveBookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveBookFacadeImpl implements SaveBookFacade{
    @Autowired
    private SaveBookService saveBookService;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public SaveBookDTO saveBook(SaveBookDTO saveBookDTO) {
        Book book=modelMapper.map(saveBookDTO, Book.class);
        book=saveBookService.saveBook(book);
        saveBookDTO=modelMapper.map(book, SaveBookDTO.class);
        return saveBookDTO;
    }
}
