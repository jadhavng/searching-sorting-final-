package com.sort;

public class QuickSort {

	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (array[j] < pivot) {
				i++;
				// swap
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
        i++;
		int temp = array[i];
		array[i] = pivot;
		array[high] = temp;
		return i;
	}

	public static void quickSort(int array[], int low, int high) {

		if (low < high) {
			int pidx = partition(array, low, high);

			quickSort(array, low, pidx - 1);
			quickSort(array, pidx + 1, high);
		}
	}

	public static void main(String[] args) {
		
		int[] array = {10, 45, 8, 56,27, 11};
		int length = array.length;
		
		quickSort(array, 0, length-1);
		
		for(int i : array) {
			System.out.print(i +" ");
		}
	}
}
