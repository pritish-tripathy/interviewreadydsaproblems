package com.interview.problems.bitmanipulation;

class XorOperationInAnArray {
	public int xorOperation(int n, int start) {
		int xor = 0;
		
		for(int i = 0; i < n; i++) {
			xor = xor ^ (start + 2 * i);
		}
		
		return xor;
	}
}

public class Leetcode1486 {
	public static void main(String[] args) {
		
	}
}
