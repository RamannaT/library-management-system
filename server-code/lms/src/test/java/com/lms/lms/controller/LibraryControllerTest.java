package com.lms.lms.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.lms.lms.library.controller.LibraryController;

@RunWith(SpringRunner.class)
@WebMvcTest(LibraryController.class)
class LibraryControllerTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void basic_test() {
		String s = "Hello world";

		assertEquals("Hello world", s);
	}

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void helloWorld() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders
				.get("/hello-world")
				.accept(MediaType.APPLICATION_JSON);
		System.out.println(request);
		MvcResult result =  mockMvc.perform(request).andReturn();
		
		assertEquals("Hello world", result.getResponse().getContentAsString());
		
		
		//call "hello-world"
		
		// verify
	}

}
