package com.sort;

public class InsertionSort {

	static void insertionSort(int arr[]) {
		int l = arr.length;
		for (int i = 1; i < l; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		int[] array = { 10, 45, 8, 56, 27, 1 };

		insertionSort(array);

		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
