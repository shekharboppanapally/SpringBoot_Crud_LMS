package com.tc.lms.repository;

import com.tc.lms.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnBookRepository extends MongoRepository<User,Integer> {
}
