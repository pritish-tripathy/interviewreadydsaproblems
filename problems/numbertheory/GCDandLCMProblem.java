package com.interview.problems.numbertheory;

import java.util.Arrays;

class FindGCDAndLCMOfTwoNumbers {
	public int[] gcdLcm(int a, int b) {
		a = Math.abs(a);
	    b = Math.abs(b);
		return new int[]{gcd(a, b), lcm(a, b), gcdEuclidean(a, b)};
	}
	
	private int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}
	
	private int lcm(int a, int b) {
		return (a / gcd(a, b)) * b; 
	}
	
	private int gcdEuclidean(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}

public class GCDandLCMProblem {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new FindGCDAndLCMOfTwoNumbers().gcdLcm(12, 56)));
	}
}
