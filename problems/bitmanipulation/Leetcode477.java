package com.interview.problems.bitmanipulation;

class TotalHammingDistance {
	public int totalHammingDistance(int[] nums) {
		int total = 0;
		int n = nums.length;

		for (int bits = 0; bits < 32; bits++) {
			int ones = 0;

			for (int num : nums) {
				ones += ((num >> bits) & 1);
			}

			total += ones * (n - ones);
		}

		return total;
	}
}

public class Leetcode477 {
	public static void main(String[] args) {

	}
}
