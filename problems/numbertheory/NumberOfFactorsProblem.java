package com.interview.problems.numbertheory;

class CalculateNumberOfFactors {
	public int numberofFactors(int n) {
		int factors = 0;
		for(int i = 1; i * i <= n; i++) {
			if(n % i == 0) {
				factors++;
				if(i != n / i) {
					factors++;
				}
			}
		}
		return factors;
	}
}

public class NumberOfFactorsProblem {
	public static void main(String[] args) {
		System.out.println(new CalculateNumberOfFactors().numberofFactors(36));
	}
}
