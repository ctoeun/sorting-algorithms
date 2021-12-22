package GenerateRandomArray;

import java.util.Random;

/**
 * Generates a random array with numbers from 1-100
 * 
 * @author Cobi Toeun
 *
 */
public class RandomArray {

	Random ran = new Random();
	int[] array;
	int size;

	public RandomArray() {
		array = generateRandomArray(size);
	}

	/**
	 * Takes random elements and stores them into array depending on size input
	 * 
	 * @param size - input on array size
	 * @return - new array
	 */
	public int[] generateRandomArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = ran.nextInt(100);
		}
		return arr;
	}
}
