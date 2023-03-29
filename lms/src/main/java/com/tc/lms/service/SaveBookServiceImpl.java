package com.tc.lms.service;

import com.tc.lms.model.Book;
import com.tc.lms.repository.SaveBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveBookServiceImpl implements SaveBookService{
    @Autowired
    private SaveBookRepository saveBookRepository;

    @Override
    public Book saveBook(Book book) {
        return saveBookRepository.save(book);
    }
}
