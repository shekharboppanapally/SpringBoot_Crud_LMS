package com.tc.lms.repository;

import com.tc.lms.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveBookRepository extends MongoRepository<Book,Integer> {
}
