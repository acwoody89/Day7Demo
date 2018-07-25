import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// arrays must be declared with a size
		int[] arr = new int[4]; // the values by default are 0 for indexes [0-3]
		
		// assigning a value of 55 to index 0, printing out at index 0
		arr[0] = 55; 
		System.out.println(Arrays.toString(arr));
		
		// assigning 77 to index 2, printing out at index 2
		arr[2] = 77;
		System.out.println(arr[2]);
		
		//for then ctrl + [space], for - iterate over array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// enhanced for loop, also known as for each
		// reference the type of the array 
		
		
		// two different ways of creating arrays
		//String[] arr2 = new String[3];
		String name = "Ben";
		String[] arr2 = {"Alex", name, "Antonella", "Brandon"};
		System.out.println(arr2[2]);
		System.out.println(arr2.length);
		
		final int SIZE = 105;
		double[] arr3;
		arr3 = new double[SIZE];
		
		// declaring, assigning size, and value in 1 step
		double[] arr4 = {4.5,6.8,9.9,10.7};
		System.out.println(Arrays.toString(arr4));
		
		
		System.out.println("Enter a size for the array");
		int userNum = scan.nextInt();
		boolean[] arr5 = new boolean[userNum];
		System.out.println(arr5.length);
		
		for (boolean temp : arr5)
		{
			System.out.println(temp);
		}
		
		int[] nums = {6,7,23,44,8};
		System.out.println(sumArray(nums));
		
		// can make arrays out of objects
		// by default if no value is added the value is null
		Robot[] robo = new Robot[2];
		robo[0] = new Robot("Grant Chirpus", 5);
		for(Robot r : robo) {
			System.out.println(r); // uses the toString() method in the Robot Class to print out
								   // would print the place in memory otherwise	
		}
		
	}
	
	public static int sumArray(int[] array) {
		int sum = 0;
		
		for (int i : array) {
			sum += i;  // sum = sum + temp
		}
		
		return sum;
	}

}
