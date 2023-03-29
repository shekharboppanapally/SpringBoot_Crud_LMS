package com.tc.lms.service;

import com.tc.lms.model.Book;
import com.tc.lms.model.User;
import com.tc.lms.repository.ReturnBookRepository;
import com.tc.lms.repository.SaveBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnBookServiceImpl implements ReturnBookService{
    @Autowired
    private ReturnBookRepository returnBookRepository;
    @Autowired
    private SaveBookRepository saveBookRepository;
    @Override
    public User returnBook(User user) {
        User existingUser=returnBookRepository.findById(user.getUserId()).get();
        int a=user.getOrder().get(0);
        int index=existingUser.getOrder().indexOf(a);
        existingUser.getOrder().remove(index);
        Book book=saveBookRepository.findById(a).get();
        book.setBooksAvailable(book.getBooksAvailable()+1);
        saveBookRepository.save(book);
        return returnBookRepository.save(existingUser);
    }
}
