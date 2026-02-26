package com.interview.problems.math;

class CountDaysSpentTogether {
	public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
		int startAlice = numberOfDays(arriveAlice);
		int endAlice = numberOfDays(leaveAlice);
		
		int startBob = numberOfDays(arriveBob);
		int endBob = numberOfDays(leaveBob);
		
		int daySpentTogether = Math.max(0, 
				Math.min(endAlice, endBob)
			  - Math.max(startAlice, startBob) + 1);
		
		return daySpentTogether;
	}
	
	// 08-15
	private int numberOfDays(String date) {
		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int month = Integer.parseInt(date.substring(0, 3));
		int days = Integer.parseInt(date.substring(3, 5));
		
		int totalDays = days;
		
		for(int i = 0; i < month - 1; i++) {
			totalDays = totalDays + monthDays[i];
		}
		
		return totalDays;
	}
}

public class Leetcode2409 {
	public static void main(String[] args) {

	}
}
