package selectionsort;

import java.util.Arrays;

import GenerateRandomArray.RandomArray;

public class SelectionSort {

	static RandomArray Array = new RandomArray();
	static int[] array = Array.generateRandomArray(20);

	/**
	 * Sorts array using selection sort O(N^2)
	 */
	public static void selectionSort(int[] arr) {
		int minIndex, temp;
		for (int i = 0; i < arr.length - 1; i++) {
			// sets min index at current index
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				// if any other element is smaller than the min, set new min
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// swap current position with new min
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	/*
	 * Checks if list is sorted
	 */
	public static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(array));
		System.out.println(isSorted(array));
		selectionSort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(isSorted(array));
	}

}
