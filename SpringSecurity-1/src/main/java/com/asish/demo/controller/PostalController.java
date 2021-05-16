package com.asish.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asish.demo.entity.Postal;
import com.asish.demo.service.PostalServiceImpl;

@Controller
public class PostalController {
	@Autowired
	private PostalServiceImpl service;
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/new")
	public String newCreate(ModelMap m,Postal pp) {
		Postal p=new Postal(pp.getId(),pp.getFname(),pp.getLname(),pp.getFatherName(),pp.getDob(),pp.getAddrs(),pp.getState(),pp.getCity(),pp.getCountry(),pp.getPincode(),pp.getEmail(),pp.getMob());
		m.put("postal", p);
		return "register";
	}
	
	@GetMapping("/getAll")
	public String gettingAll(ModelMap m) {
		List<Postal> ll=service.getAllUser();
		m.put("plist", ll);
		return "home";
	}
	@PostMapping("/create")
	public String create(@ModelAttribute("postal") @Valid Postal p,BindingResult result) {
		if(p.getId()==0&&result.hasErrors()) {
			return "register";
		}
		service.create(p);
		return "redirect:/getAll";
	}
	@GetMapping("/update")
	public String update(@RequestParam("id")int id,ModelMap m) {
		Postal p=service.getById(id);
		m.put("postal", p);
		return "register";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("id")int id) {
		service.delete(id);
		return "redirect:/getAll";
	}
	
	

}
