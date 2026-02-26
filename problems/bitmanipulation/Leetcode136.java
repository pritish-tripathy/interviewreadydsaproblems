package com.interview.problems.bitmanipulation;

class SingleNumber {
	public int singleNumber(int[] nums) {
		int result = 0;
		for(int num : nums) {
			result = result ^ num;
		}
		return result;
	}
}

public class Leetcode136 {
	public static void main(String[] args) {
		
	}
}
