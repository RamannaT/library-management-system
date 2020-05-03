package com.lms.lms.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookController {

	@Test
	void test() {
		String name = "Ramesh";
		assertEquals("Ramesh", name);
	}

	@Test
	public void basic_test() {
		int a = 5 * 2;
		assertEquals(10, a);
	}
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void basic_hello() throws Exception{
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("//hello-world")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request).andReturn();
		
		assertEquals("Hello world", result.getResponse().getContentAsString());
		
	}

}
