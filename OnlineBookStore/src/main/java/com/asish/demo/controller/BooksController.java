package com.asish.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.RollbackException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asish.demo.entity.Books;
import com.asish.demo.service.BookServiceImpl;

@Controller
public class BooksController {
	@Autowired
	private BookServiceImpl service;
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/get")
	public String getAll(ModelMap m) {
		List<Books> blist=service.getAllBooks();
		m.put("blist", blist);
		return "home";
	}
	@GetMapping("/create")
	public String create(ModelMap m) {
		Books b=new Books();
		m.put("books", b);
		return "create";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute(value = "books") @Valid Books b,BindingResult result)  {
		if(result.hasErrors()) {
			return "create";
		}
		
			service.saveBooks(b);
		
		return "redirect:/get";
	}
	@GetMapping("/update")
	public String update(@RequestParam("id") int id,ModelMap m) {
		Optional<Books> b=service.getById(id);
		m.put("books", b);
		return "create";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		service.deleteBooks(id);
		return "redirect:/get";
	}
	@GetMapping("/name")
	public String searchByName(Books b, ModelMap m,@RequestParam("name") String name) {
		
		List<Books> bb=service.findByName(name);
		m.put("name", bb);
		return "names";
	}

}
