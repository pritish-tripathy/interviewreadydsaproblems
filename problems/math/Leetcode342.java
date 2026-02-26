package com.interview.problems.math;

class PowerOfFour {
	public boolean isPowerOfFour(int n) {
		if(n <= 0) {
			return false;
		}
		
		while(n % 4 == 0) {
			n = n / 4;
		}
		
		return n == 1;
	}
}

public class Leetcode342 {
	public static void main(String[] args) {
		
	}
}
