package assignment_3;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		Random random = new Random();
		int counter = 0;
		for (int i :arr) {
			arr[counter++] = random.nextInt(-100, 100);
		}
		System.out.println("minimum value of array : " + arrayMinimumNumber(arr));
		System.out.println("maximum value of array : " + arrayMaximumNumber(arr));
		System.out.println("average value of array : " + arrayAverageNumber(arr));
		System.out.println("sorted copy of array : " + Arrays.toString(arraySorted(arr)));
		System.out.println("the origenal array : " + Arrays.toString(arr));
	}
	
	// Method that returns the minimum value of integer array
	static int arrayMinimumNumber(int[] arr) {
		int minimum = arr[0];
		for (int i : arr) {
			if(i < minimum) minimum = i;
		}
		return minimum;
	}
	

	// Method that returns the Maximum of integer array
	static int arrayMaximumNumber(int[] arr) {
		int maximum = arr[0];
		for (int i : arr) {
			if(i > maximum) maximum = i;
		}
		return maximum;
	}
	

	// Method that returns the Average value of integer array
	static double arrayAverageNumber(int[] arr) {
		double sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum / arr.length;
	}
	

	// Method that returns a sorted array 
	static int[] arraySorted(int[] arr) {
		int[] copy_arr = arr.clone();
		 Arrays.sort(copy_arr);
		 return copy_arr;
	}

}
