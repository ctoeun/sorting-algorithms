package insertionsort;

import java.util.Arrays;

import GenerateRandomArray.RandomArray;

public class InsertionSort {

	static RandomArray ran = new RandomArray();
	static int[] array = ran.generateRandomArray(10);

	/*
	 * Sorting an array using insertion sort O(N^2)
	 */
	public static void insertionSort(int[] array) {
		int key, temp;
		// getting the element you want to compare
		for (int i = 1; i < array.length; i++) {
			// the element you want to compare
			key = array[i];
			// getting elements to the left of key and comparing
			for (int j = i - 1; j >= 0; j--) {
				// if key is less than the element, then swap positions
				if (key < array[j]) {
					// swap elements
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				} else {
					// elements in front are already sorted
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(array));

		insertionSort(array);

		System.out.println(Arrays.toString(array));
	}

}
