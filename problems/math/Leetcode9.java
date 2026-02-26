package com.interview.problems.math;

class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if(x < 0) {
			return false;
		}
		
		int xCopy = x;
		int reverse = 0;
		while(x != 0) {
			int digit = x % 10;
			reverse = reverse * 10 + digit;
			x = x / 10;
		}
		
		return xCopy == reverse;
	}
}

public class Leetcode9 {
	public static void main(String[] args) {
		
	}
}
