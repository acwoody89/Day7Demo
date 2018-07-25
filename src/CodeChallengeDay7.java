import java.util.Arrays;

/*
 * Given an array of ints length 3, 
 * figure out which is larger, 
 * the first or last element in the array, 
 * and set all the other elements to be that value. 
 * Return the changed array.
 */
public class CodeChallengeDay7 {

	public static void main(String[] args) {
		int[] arr = {98, 43, 22};
		
		System.out.println(Arrays.toString(smallerLarger(arr)));
		int[] max = smallerLarger(arr);
		
		for(int i = 0; i < max.length; i++) {
			System.out.println(max[i]);
		}
		
		// using the right hand side to get return value info
		for(int i = 0; i < smallerLarger(arr).length; i++) {
			System.out.println(max[i]);
		}
		
		System.out.println("enhanced for loop");
		for(int n : max) {
			System.out.println(n);
		}
	}

	public static int[] test(int[] array) {
		int[] nums = { 1, 2, 3 };
		return nums;
	}

	public static int[] smallerLarger(int[] array) {
		int large = 0;

		if (array[0] > array[array.length - 1]) {
			large = array[0];
		} else {
			large = array[array.length - 1];
		}
		
		// going through each index and changing to the largest value
		for (int i = 0; i < array.length; i++) {
			array[i] = large;
		}
		
		//Arrays.fill(nums, temp); also valid solution
		return array;
	}
}