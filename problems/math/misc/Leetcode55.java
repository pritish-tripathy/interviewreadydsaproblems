package com.interview.problems.math.misc;

class JumpGame {
	public boolean canJump(int[] nums) {
		int reachable = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > reachable) {
				return false;
			}
			reachable = Math.max(reachable, i + nums[i]);
		}
		return true;
	}
}

public class Leetcode55 {
	public static void main(String[] args) {

	}
}
