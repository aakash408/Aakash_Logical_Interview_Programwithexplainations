package com.reverse.integer;

public class Solution1 {
	public static void main(String[] args) {

		int number = 123;
		int reversenumber = 0;
		int lastDigit;

		while (number != 0) {
			lastDigit = number % 10;
			reversenumber = reversenumber * 10 + lastDigit;
			number = number / 10;
		}

		System.out.println(reversenumber);
	}
}
