package com.tc.lms.service;

import com.tc.lms.model.Book;
import com.tc.lms.model.User;
import com.tc.lms.repository.OrderBookRepository;
import com.tc.lms.repository.SaveBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderBookServiceImpl implements OrderBookService{
    @Autowired
    private OrderBookRepository orderBookRepository;
    @Autowired
    private SaveBookRepository saveBookRepository;
    @Override
    public User orderBook(User user) {
        User existingUser=orderBookRepository.findById(user.getUserId()).get();
        int a=user.getOrder().get(0);
        if(!(saveBookRepository.existsById(a))){
            System.out.println("Book not Found !");
            return orderBookRepository.save(existingUser);
        }
        for ( int num : existingUser.getOrder()){
            if(num==a){
                System.out.println("Book Already Taken !");
                return orderBookRepository.save(existingUser);
            }
        }
        existingUser.getOrder().add(a);
        Book book=saveBookRepository.findById(a).get();
        book.setBooksAvailable(book.getBooksAvailable()-1);
        saveBookRepository.save(book);
        return orderBookRepository.save(existingUser);
    }
}
