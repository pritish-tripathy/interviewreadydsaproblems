package com.interview.problems.math;

class DayOfTheYear {
	public int dayOfYear(String date) {
		//2019-01-09
		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int days = Integer.parseInt(date.substring(8, 10));
		
		int totalDays = days;
		for(int i = 0; i < month - 1; i++) {
			totalDays = totalDays + monthDays[i];
		}
		
		if(month > 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			totalDays++;
		}
		
		return totalDays;
	}
}

public class Leetcode1154 {
	public static void main(String[] args) {
		
	}
}
