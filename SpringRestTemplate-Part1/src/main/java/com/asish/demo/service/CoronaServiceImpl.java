package com.asish.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asish.demo.entity.Corona;
import com.asish.demo.repository.CoronaRepository;
@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class CoronaServiceImpl implements CoronaService {
	@Autowired
	private CoronaRepository repo;

	@Override
	public List<Corona> getAllPatients() {
		return repo.findAll();
	}

	@Override
	public Optional<Corona> getPatientsById(int id) {
		Optional<Corona> result=repo.findById(id);
		return result;
	}

	@Override
	public Corona createPatients(Corona c) {
		return repo.save(c);
	}

	@Override
	public Corona updatePatients(Corona c) {
		return repo.save(c);
	}

	@Override
	public void deletePatients(int id) {
		repo.deleteById(id);

	}

}
