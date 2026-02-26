package com.interview.problems.math.misc;

class PowXN {
	public double myPow(double x, int n) {
        long N = n;
        if(N < 0) {
        	x = 1 / x;
        	N = -N;
        }
        return fastPow(x, N);
    }
	
	private double fastPow(double x, long n) {
		if(n == 0) {
			return 1;
		}
		
		double half = fastPow(x, n / 2);
		return (n % 2 == 0) ? half * half : x * half * half;
	} 
}

public class Leetcode50 {
	public static void main(String[] args) {
		
	}
}
