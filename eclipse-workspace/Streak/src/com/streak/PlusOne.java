package com.streak;

public class PlusOne {
	public static void main(String[] args) {
		int[] arr = { 9, 9, 9, 9 };
		int res[] = plusOne(arr);

		for (int a : res)
			System.out.print(a + " ");

	}

	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] < 9) {1}
			digits[i] = 0;

		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;

	}
}
