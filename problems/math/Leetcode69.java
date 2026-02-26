package com.interview.problems.math;

class SqrtX {
	public int mySqrt(int x) {
		int low = 0;
		int high = x;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			long result = (long)mid * mid;
			if(result == x) {
				return mid;
			} else if(result > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return high;
	}
}

public class Leetcode69 {
	public static void main(String[] args) {
		
	}
}
