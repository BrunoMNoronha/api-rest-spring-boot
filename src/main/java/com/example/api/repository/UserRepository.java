package com.example.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.User;

@Repository
public interface UserRepository  extends MongoRepository<User, String>{

}
