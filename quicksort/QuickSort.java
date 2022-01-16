package quicksort;

import java.util.Arrays;
import java.util.Random;

import GenerateRandomArray.RandomArray;

public class QuickSort {

	public static void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}

	private static void quicksort(int array[], int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}

		int pivot_index = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivot_index];
		swap(array, pivot_index, highIndex);

		int left_pointer = partition(array, lowIndex, highIndex, pivot);

		quicksort(array, lowIndex, left_pointer - 1);
		quicksort(array, left_pointer + 1, highIndex);

	}

	private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int left_pointer = lowIndex, right_pointer = highIndex;

		while (left_pointer < right_pointer) {
			while (array[left_pointer] <= pivot && left_pointer < right_pointer) {
				left_pointer++;
			}
			while (array[right_pointer] >= pivot && left_pointer < right_pointer) {
				right_pointer--;
			}

			swap(array, left_pointer, right_pointer);
		}

		swap(array, left_pointer, highIndex);

		return left_pointer;
	}

	private static void swap(int[] array, int first_index, int second_index) {
		int temp = array[first_index];
		array[first_index] = array[second_index];
		array[second_index] = temp;
	}

	public static void main(String[] args) {
		RandomArray ran = new RandomArray();

		int[] array = ran.generateRandomArray(100);

		System.out.println(Arrays.toString(array));

		quicksort(array);

		System.out.println(Arrays.toString(array));
	}

}
