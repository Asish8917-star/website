package com.asish.demo.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.RollbackException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asish.demo.entity.Books;
import com.asish.demo.repository.BooksRepository;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BooksRepository repo;

	@Override
	
	public List<Books> getAllBooks() {
		
		return repo.findAll();
	}

	@Override
	
	public Books saveBooks(Books b) {
		
		return repo.save(b);
	}

	@Override
	
	public Books updateBooks(Books b) {
		
		return repo.save(b);
	}

	@Override
	
	public void deleteBooks(int id) {
		repo.deleteById(id);

	}
	
	public List<Books> findByName(String name) {
		return repo.findByBookName(name);
	}

	@Override
	
	public Optional<Books> getById(int id) {
		Optional<Books> result=repo.findById(id);
		return result;
	}





}
