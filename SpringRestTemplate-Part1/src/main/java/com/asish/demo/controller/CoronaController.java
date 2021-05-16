package com.asish.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asish.demo.entity.Corona;
import com.asish.demo.exception.DataNotFoundException;
import com.asish.demo.service.CoronaService;

@RestController
@RequestMapping(path = "/rest")
public class CoronaController {
	@Autowired
	private CoronaService service;
	@GetMapping("/get")
	public List<Corona> getAll(){
		List<Corona> l=service.getAllPatients();
		return l;
	}
	@GetMapping("/get/{id}")
	public Corona getById(@PathVariable("id") int id){
		Optional<Corona> result=service.getPatientsById(id);
		return result.orElseThrow(()->new DataNotFoundException("patient not found: "+id));
	}
	@PostMapping("/create")
	public Corona insert(@RequestBody Corona c) {
		Corona corona=service.createPatients(c);
		return corona;
	}
	@PutMapping("/update/{id}")
	public Corona update(@PathVariable("id") int id,@RequestBody Corona c) {
		//Optional<Corona>result=service.getPatientsById(id);
		Corona cr=new Corona();
		cr.setId(c.getId());
		cr.setPatientName(c.getPatientName());
		cr.setState(c.getState());
		return service.updatePatients(cr);
	}
	@DeleteMapping("/delete/{id}")
	public String deletePatients(@PathVariable("id") int id) {
		service.deletePatients(id);
		return "Resource deleted Successfully";
	}

}
