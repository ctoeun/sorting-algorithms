package mergesort;

/**
 * Merge sort using recursion with O(N) space
 * 
 * @author Cobi Toeun
 *
 */
public class MergeSort {

	/*
	 * Merge sorting recursively
	 */
	public void mergeSort(int[] array) {
		// base case
		if (array.length <= 1) {
			return;
		}

		int mid = (array.length) / 2;

		int[] leftArray = new int[mid];
		int[] rightArray = new int[array.length - mid];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = array[i];
		}

		for (int j = 0; j < rightArray.length; j++) {
			rightArray[j] = array[mid + j];
		}

		// use recursion (call itself)
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(array, leftArray, rightArray);
	}

	/**
	 * Merging two arrays together
	 * 
	 * @param leftArray
	 * @param rightArray
	 * @return
	 */
	public void merge(int[] array, int[] leftArray, int[] rightArray) {
		int left = 0, right = 0, index = 0;

		// while there are still elements in left and right array merge arrays
		while (left < leftArray.length && right < rightArray.length) {
			// element in left array is < than element in right
			if (leftArray[left] <= rightArray[right]) {
				array[index++] = leftArray[left++];
			} else {
				array[index++] = rightArray[right++];
			}
		}

		// fill in rest of left array to result if there still contains elements
		while (left < leftArray.length) {
			array[index++] = leftArray[left++];
		}
		// fill in rest of right array to result
		while (right < rightArray.length) {
			array[index++] = rightArray[right++];
		}
	}

}
