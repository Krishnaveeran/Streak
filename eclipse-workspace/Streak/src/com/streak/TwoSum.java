package com.streak;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		TwoSum ts = new TwoSum();
		int[] arr = { 3, 2, 4 };
		int target = 6;
		 int[] results = ts.twoSum(arr, target);
		int[] results1 = ts.twoSum1(arr, target);
		for (int a : results1)
			System.out.print(a + " ");

	}

	private int[] twoSum1(int[] arr, int target) {
		// TODO Auto-generated method stub O(n)
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int element = target - arr[i];

			if (hm.containsKey(element))
				return new int[] { hm.get(element), i };

			hm.put(arr[i], i);

		}

		return new int[] {};
	}

	private int[] twoSum(int[] arr, int target) {
		// TODO Auto-generated method stub Brute Force Approach O(n^2)
		int[] results = new int[2];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					results[0] = i;
					results[1] = j;
				}
			}
		}
		return results;
	}
}
