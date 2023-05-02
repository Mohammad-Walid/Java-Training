package assignment_3;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		Random random = new Random();
		int counter = 0;
		//filling array with rndom integers
		for (@SuppressWarnings("unused") int i :arr) {
			arr[counter++] = random.nextInt(-100, 100);
		}
		System.out.println("Minimum value of array : " + arrayMinimumNumber(arr));
		System.out.println("Maximum value of array : " + arrayMaximumNumber(arr));
		System.out.println("Average value of array : " + arrayAverageNumber(arr));
		System.out.println("Sorted copy of array   : " + Arrays.toString(arraySorted(arr)));
		System.out.println("The origenal array     : " + Arrays.toString(arr));
	}
	
	// Method that returns the minimum value of integer array
	static Integer arrayMinimumNumber(int[] arr) {
		if(arr == null || arr.length == 0 ) 
			return null;
		int minimum = arr[0];
		for (int i : arr) {
			if(i < minimum) minimum = i;
		}
		return minimum;
	}
	

	// Method that returns the Maximum of integer array
	static Integer arrayMaximumNumber(int[] arr) {
		if(arr == null || arr.length == 0 ) 
			return null;
		int maximum = arr[0];
		for (int i : arr) {
			if(i > maximum) maximum = i;
		}
		return maximum;
	}
	

	// Method that returns the Average value of integer array
	static Double arrayAverageNumber(int[] arr) {
		if(arr == null || arr.length == 0 ) 
			return null;
		double sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum / arr.length;
	}
	

	// Method that returns a sorted array 
	static int[] arraySorted(int[] arr) {
		if(arr == null || arr.length == 0 ) 
			return null;
		int[] copy_arr = arr.clone();
		 Arrays.sort(copy_arr);
		 return copy_arr;
	}

}
