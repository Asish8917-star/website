package com.asish.demo.service;

import java.util.List;

import com.asish.demo.entity.Postal;

public interface PostalService {
	
	public List<Postal> getAllUser();
	public Postal getById(int id);
	public Postal create(Postal p);
	public Postal update(Postal p);
	public void delete(int id);

}
