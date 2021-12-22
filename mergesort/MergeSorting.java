package mergesort;

import java.util.Arrays;

/**
 * Merge sort using cleaner method
 * 
 * @author Cobi Toeun
 *
 */
public class MergeSorting {

	public static void mergeSort(int[] array, int start, int end) {
		// base case
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);
			merge(array, start, mid, end);
		}
	}

	public static void merge(int[] array, int start, int mid, int end) {
		// build temp array to avoid modifying original contents of og array
		int[] temp = new int[end + start + 1];
		int left = start, right = mid + 1, index = 0;

		// start merging and comparing
		while (left <= mid && right <= end) {
			if (array[left] <= array[right]) {
				temp[index++] = array[left++];
			} else {
				temp[index++] = array[right++];
			}
		}
		// insert rest of left array to temp
		while (left <= mid) {
			temp[index++] = array[left++];
		}
		// insert rest of right array to temp
		while (right <= end) {
			temp[index++] = array[right++];
		}

		// copy temp elements to og array
		for (int i = start; i <= end; i++) {
			array[i] = temp[i - start];
		}
	}

	public static void main(String[] args) {
		int[] array = { -5, 20, 10, 3, 2, 0 };
		mergeSort(array, 0, array.length - 1);

		System.out.println(Arrays.toString(array));
	}

}
