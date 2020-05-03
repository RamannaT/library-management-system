package com.lms.lms;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.lms.lms.repository.RepositoryImpl;

@SpringBootTest
class LibraryManagementApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void calculate_basic() {
		RepositoryImpl repositoryImpl = new RepositoryImpl();
		int actualResult = repositoryImpl.calculateSum(new int[] { 1, 2, 3 });
		int expectedReult = 6;
		assertEquals(expectedReult, actualResult);
		// fail("Not yet implemented");
	}
}
