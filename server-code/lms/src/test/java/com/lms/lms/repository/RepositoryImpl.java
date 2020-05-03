package com.lms.lms.repository;

public class RepositoryImpl {

	public int calculateSum(int[] data) {
		int sum = 0;
		for (int value : data) {
			sum += value;
		}
		return sum;
	}
	
	
}
