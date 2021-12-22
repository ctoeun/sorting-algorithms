package bubblesort;

import java.util.Arrays;

import GenerateRandomArray.RandomArray;

public class BubbleSort {

	static RandomArray Array = new RandomArray();
	static int[] array = Array.generateRandomArray(5);

	/**
	 * Compares two elements and puts smaller number in front
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < (arr.length - 1) - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(array));
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}

}
