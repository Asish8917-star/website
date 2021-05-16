package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.MyMongo;

public interface MyMongoService {
	public List<MyMongo> findall();
	public Optional<MyMongo> getById(int id);
	public MyMongo saveall(MyMongo mongo);
	public MyMongo update(MyMongo mongo);
	public void delete(int id);

}
