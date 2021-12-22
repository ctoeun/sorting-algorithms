package mergesort;

import java.util.ArrayList;

public class MergeSortArrayList {

	public static <E extends Comparable<? super E>> void mergeSort(ArrayList<E> array) {
		if (array.size() <= 1) {
			return;
		}

		int mid = array.size() / 2;

		ArrayList<E> leftArray = new ArrayList<E>();
		ArrayList<E> rightArray = new ArrayList<E>();

		for (int i = 0; i < mid; i++) {
			leftArray.add(array.get(i));
		}

		for (int i = mid; i < array.size(); i++) {
			rightArray.add(array.get(i));
		}

		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(array, leftArray, rightArray);
	}

	public static <E extends Comparable<? super E>> void merge(ArrayList<E> array, ArrayList<E> leftArray,
			ArrayList<E> rightArray) {
		int leftPos = 0, rightPos = 0, index = 0;

		while (leftPos < leftArray.size() && rightPos < rightArray.size()) {
			if ((leftArray.get(leftPos)).compareTo(rightArray.get(rightPos)) < 0) {
				array.set(index++, leftArray.get(leftPos++));
			} else {
				array.set(index++, rightArray.get(rightPos++));
			}
		}

		while (leftPos < leftArray.size()) {
			array.set(index++, leftArray.get(leftPos++));
		}
		while (rightPos < rightArray.size()) {
			array.set(index++, rightArray.get(rightPos++));
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(3);
		array.add(10);
		array.add(5);
		array.add(18);
		array.add(1);
		array.add(0);

		System.out.println(array);
		mergeSort(array);
		System.out.println(array);
	}

}
