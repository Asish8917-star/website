package com.asish.demo.test;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.asish.demo.AmeerpetRepository;
@RunWith(SpringRunner.class)
@WebMvcTest
public class SpringRestTest {
	@Autowired
	private MockMvc mock;
	@MockBean
	AmeerpetRepository repo;
	@Test
	public void test() throws Exception {
		Mockito.when(repo.findAll()).thenReturn(Collections.emptyList());
		MvcResult result=mock.perform(MockMvcRequestBuilders.get("/rest/").accept(MediaType.APPLICATION_JSON)).andReturn();
		System.out.println(result.getResponse());
		Mockito.verify(repo).findAll();
		
	}
}
