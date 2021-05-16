package com.asish.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asish.demo.entity.Books;
@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {
	public List<Books> findByBookName(String name);
}
