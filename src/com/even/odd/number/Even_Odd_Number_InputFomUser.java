package com.even.odd.number;

import java.util.Scanner;

public class Even_Odd_Number_InputFomUser {

	public static void main(String[] args) {

		int eo;

		Scanner input = new Scanner(System.in);
		eo = input.nextInt();

		if ((eo & 1) == 1) {
			System.out.println("Number is ODD");
		} else {
			System.out.println("Number is EVEN");
		}
	}
}
