package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MyMongo;
import com.example.demo.repository.MyMongoRepository;

@Service
public class MyMongoServiceImpl implements MyMongoService {
	@Autowired
	private MyMongoRepository repo;

	@Override
	public List<MyMongo> findall() {
		
		return repo.findAll();
	}

	@Override
	public MyMongo saveall(MyMongo mongo) {
		
		return repo.save(mongo);
	}

	@Override
	public MyMongo update(MyMongo mongo) {
		
		return repo.save(mongo);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);

	}

	@Override
	public Optional<MyMongo> getById(int id) {
		Optional<MyMongo> result=repo.findById(id);
		return result;
	}

}
