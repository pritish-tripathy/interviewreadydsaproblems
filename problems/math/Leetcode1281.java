package com.interview.problems.math;

class SubtractTheProductAndSumOfDigitsOfAnInteger {
	// 1*
	public int subtractProductAndSum(int n) {
		int product = 1;
		int sum = 0;
		while(n != 0) {
			int digit = n % 10;
			product = product * digit;
			sum = sum + digit;
			n = n / 10;
		}
		return product - sum;
		
		// return product(n) - sum(n);
	}
	/*
	private int product(int n) {
		int product = 1;
		while(n != 0) {
			int digit = n % 10;
			product = product * digit;
			n = n / 10;
		}
		return product;
	}
	
	private int sum(int n) {
		int sum = 0;
		while(n != 0) {
			int digit = n % 10;
			sum = sum * 10 + digit;
			n = n / 10;
		}
		return sum;
	}
	*/
	
}

public class Leetcode1281 {
	public static void main(String[] args) {
		
	}
}
