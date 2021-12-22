package mergesort;

import java.util.Arrays;

import GenerateRandomArray.RandomArray;

public class SortTest {

	static RandomArray ran = new RandomArray();
	static int[] array = ran.generateRandomArray(10);
	static int[] arr = {3,2,1,5};

	public static void main(String[] args) {
		MergeSort Array = new MergeSort();
		
		System.out.println(Arrays.toString(arr));
		
		Array.mergeSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
