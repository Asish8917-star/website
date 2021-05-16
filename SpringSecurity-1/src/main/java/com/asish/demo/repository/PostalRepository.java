package com.asish.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.asish.demo.entity.Postal;
@Repository
public interface PostalRepository extends CrudRepository<Postal, Integer> {

}
