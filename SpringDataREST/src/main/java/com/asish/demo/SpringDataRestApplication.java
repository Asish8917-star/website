package com.asish.demo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication {
	@Autowired
	private UserRepository repo;
	@PostConstruct
	public void init() {
		repo.saveAll(Stream.of(new AsishUser(101,"Asish","Patrapur"),
				new AsishUser(102,"Bikash","jayantipur"),
				new AsishUser(103,"Rupesh","samantiapalli"),
				new AsishUser(104,"Rakesh","chikiti"))
				.collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

}
