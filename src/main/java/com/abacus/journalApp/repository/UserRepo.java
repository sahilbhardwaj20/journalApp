package com.abacus.journalApp.repository;

import com.abacus.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepo extends MongoRepository<User, ObjectId> {
    User findByUserName(String userName);
    void deleteByUserName(String username);
}