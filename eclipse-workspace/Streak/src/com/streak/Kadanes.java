package com.streak;

public class Kadanes {

	public static void main(String[] args) {
		int[] a = { -2, -3, -4, -1, -2, 0, -5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	private static int maxSubArraySum(int[] a) {
		// TODO Auto-generated method stub
		int maxSum = Integer.MIN_VALUE;
		int maxEnd = 0;
		for (int i = 0; i < a.length - 1; i++) {
			maxEnd = maxEnd + a[i];
			if (maxSum < maxEnd)
				maxSum = maxEnd;
			if (maxEnd < 0)
				maxEnd = 0;
		}

		return maxSum;
	}

}
