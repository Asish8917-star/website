package com.asish.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asish.entity.Teacher;
import com.asish.repository.TeacherRepository;

@RestController
@RequestMapping(path = "/rest/tech")
public class TeacherController {
	@Autowired
	private TeacherRepository repo;
	@GetMapping("/get")
	public List<Teacher> getAllTeacher(){
		return repo.findAll();
	}
	@GetMapping("/notes/{id}")
	public ResponseEntity<Optional<Teacher>> getById(@PathVariable(value = "id") Integer id){
		Optional<Teacher> tech=repo.findById(id);
		if(tech==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(tech);
	}
	@PostMapping("/teacher")
	public Teacher create(@RequestBody Teacher tech) {
		return repo.save(tech);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Teacher> update(@PathVariable(value = "id") long id,@RequestBody Teacher techDetails){
		Optional<Teacher> tech=repo.findById((int) id);
		if(tech==null) {
			return ResponseEntity.notFound().build();
		}
		Teacher tch=new Teacher();
		tch.setId(techDetails.getId());
		tch.setName(techDetails.getName());
		tch.setSchoolName(techDetails.getSchoolName());
		tch.setAddrs(techDetails.getAddrs());
		tch=repo.save(tech);
		return ResponseEntity.ok().body(tch);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Teacher> delete(@PathVariable(value = "id")long id){
		Optional<Teacher> tech=repo.findById((int) id);
		if(tech==null) {
			return ResponseEntity.notFound().build();
		}
		repo.deleteById(tech);
		return ResponseEntity.ok().build();
		
	}

}
