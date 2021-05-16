package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MyMongo;
@Repository
public interface MyMongoRepository extends MongoRepository<MyMongo, Integer> {

}
