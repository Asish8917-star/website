package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.MyMongo;
import com.example.demo.service.MyMongoService;

@Controller
public class MyMongoController {
	@Autowired
	private MyMongoService service;
	@GetMapping("/")
	public String getAll(ModelMap m) {
		List<MyMongo> ll=service.findall();
		m.put("list", ll);
		return "index";
	}
	@GetMapping("/create")
	public String create(ModelMap m) {
		MyMongo mm=new MyMongo();
		m.put("mongo", mm);
		return "create";
	}
	@PostMapping("/save")
	public String create(@ModelAttribute("mongo")MyMongo mm,BindingResult result) {
		if(result.hasErrors()) {
			return "create";
		}
		service.saveall(mm);
		return "redirect:/";
	}
		
	

}
