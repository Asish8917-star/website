package com.asish.demo.service;

import java.util.List;
import java.util.Optional;

import com.asish.demo.entity.Corona;

public interface CoronaService {
	public List<Corona> getAllPatients();
	public Optional<Corona> getPatientsById(int id);
	public Corona createPatients(Corona c);
	public Corona updatePatients(Corona c);
	public void deletePatients(int id);

}
