package com.interview.problems.math;

class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		int numerator = n;
		int denominator = 5;
		int totalzeroes = 0;
		
		while(denominator <= numerator) {
			totalzeroes = totalzeroes + numerator / denominator;
			denominator = denominator * 5;
		}
		
		return totalzeroes;
	}
}

public class Leetcode172 {
	public static void main(String[] args) {
		
	}
}
