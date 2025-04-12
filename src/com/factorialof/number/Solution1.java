package com.factorialof.number;

public class Solution1 {
	public static void main(String[] args) {
		int number = 2;
		int result = 1;

		for (int i = 1; i < number; i++) {
			result = result * i;
		}
		System.out.println(result);
	}
}
