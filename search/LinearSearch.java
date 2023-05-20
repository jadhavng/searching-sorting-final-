package com.search;

public class LinearSearch {

	public static int linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = { 10, 45, 8, 56, 27, 1 };
		int target = 46;

		System.out.println("Index of target : " + linearSearch(array, target));
	}
}
