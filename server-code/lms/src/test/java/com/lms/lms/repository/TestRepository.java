package com.lms.lms.repository;

import static org.junit.Assert.*;

import org.junit.Test;

 
public class TestRepository {

	@Test
	public void calculate_basic() {
		RepositoryImpl repositoryImpl = new RepositoryImpl();
		int actualResult = repositoryImpl.calculateSum(new int[] { 1, 2, 3 });
		int expectedReult = 6;
		assertEquals(expectedReult, actualResult);
		// fail("Not yet implemented");
	}

	@Test
	public void calculate_empty() {
		RepositoryImpl repositoryImpl = new RepositoryImpl();
		int actualResult = repositoryImpl.calculateSum(new int[] {});
		int expectedReult = 0;
		assertEquals(expectedReult, actualResult);
	}
	
	@Test
	public void test_one() {
		RepositoryImpl repositoryImpl = new RepositoryImpl();
		int actualResult = repositoryImpl.calculateSum(new int[] {5});
		int expectedReult = 5;
		assertEquals(expectedReult, actualResult);
	}

}
