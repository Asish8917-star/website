package com.asish.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asish.demo.entity.Postal;
import com.asish.demo.repository.PostalRepository;
@Service
@Transactional(rollbackFor = Exception.class)
public class PostalServiceImpl implements PostalService {
	@Autowired
	private PostalRepository repo;

	@Override
	public List<Postal> getAllUser() {
		
		return (List<Postal>) repo.findAll();
	}

	@Override
	public Postal getById(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Postal create(Postal p) {
		
		return repo.save(p);
	}

	@Override
	public Postal update(Postal p) {
		
		return repo.save(p);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

}
