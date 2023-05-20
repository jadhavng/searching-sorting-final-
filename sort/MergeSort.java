package com.sort;

public class MergeSort {

	static void devide(int array[], int si, int ei) {
		if (si >= ei) {
			return;
		}

		int mid = si + (ei - si) / 2;

		devide(array, si, mid);
		devide(array, mid + 1, ei);
		conquer(array, si, mid, ei);

	}

	private static void conquer(int[] array, int si, int mid, int ei) {
		int merged[] = new int[ei - si + 1];

		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0;

		while (idx1 <= mid && idx2 <= ei) {
			if (array[idx1] <= array[idx2]) {
				merged[x++] = array[idx1++];
			} else {
				merged[x++] = array[idx2++];
			}

		}

		while (idx1 <= mid) {
			merged[x++] = array[idx1++];
		}

		while (idx2 <= ei) {
			merged[x++] = array[idx2++];
		}

		for (int i = 0, j = si; i < merged.length; i++, j++) {
			array[j] = merged[i];
		}

	}

	public static void main(String[] args) {

		int[] array = { 10, 45, 8, 56, 27, 1 };
		int length = array.length;

		devide(array, 0, length - 1);
		// print
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
