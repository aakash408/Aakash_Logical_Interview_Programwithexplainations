package com.even.odd.number;

public class Even_Odd_Bitwise {

	public static void main(String[] args) {

		int number = 4;

		if ((number & 1) == 1) {
			System.out.println("Number is ODD");
		} else {
			System.out.println("Number is EVEN");
		}
	}
}
