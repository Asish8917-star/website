package com.asish.demo;

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

@RestController
@RequestMapping(path = "/rest")
public class AmeerpetController {
	@Autowired
	private AmeerpetRepository repo;
	@GetMapping("/get")
	public List<Ameerpet> getAll(){
		return repo.findAll();
	}
	@GetMapping("/get/{id}")
	public Ameerpet getById(@PathVariable(value = "id")int id) {
		return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("user not found: "+id));
	}
	@PostMapping("/create")
	public Ameerpet create(@RequestBody Ameerpet a) {
		return repo.save(a);
	}
	@PutMapping("/update/{id}")
	public Ameerpet update(@PathVariable(value = "id")int id,@RequestBody Ameerpet a) {
		Optional<Ameerpet> am=repo.findById(id);
		Ameerpet ap=new Ameerpet();
		ap.setId(a.getId());
		ap.setName(a.getName());
		ap.setAddrs(a.getAddrs());
		return repo.save(ap);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable(value = "id")int id) {
		 repo.deleteById(id);
		return "deleted successfully";
	}
}
