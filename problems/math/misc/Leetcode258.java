package com.interview.problems.math.misc;

class AddDigits {
	public int addDigits(int num) {
		if (num <= 9) {
			return num;
		}

		return 1 + (num - 1) % 9;
	}
}

public class Leetcode258 {
	public static void main(String[] args) {

	}
}
