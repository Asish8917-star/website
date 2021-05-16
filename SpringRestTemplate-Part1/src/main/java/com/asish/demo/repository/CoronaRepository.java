package com.asish.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asish.demo.entity.Corona;
@Repository
public interface CoronaRepository extends JpaRepository<Corona, Integer> {

}
