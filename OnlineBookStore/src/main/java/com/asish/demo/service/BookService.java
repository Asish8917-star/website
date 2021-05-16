package com.asish.demo.service;

import java.util.List;
import java.util.Optional;

import com.asish.demo.entity.Books;

public interface BookService {
	public List<Books> getAllBooks();
	public Books saveBooks(Books b);
	public Books updateBooks(Books b);
	public void deleteBooks(int id);
	public Optional<Books> getById(int id);

}
