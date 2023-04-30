package assignment_1;

public class SumOfOddNumbers {

	public static void main(String[] args) {

		// sum of odd numbers from 0 to 100 ( 100 is included) using for loop
		int sumOfOdd = 0;
		for (int i = 1; i <= 100; i += 2) {
			sumOfOdd += i;
		}
		System.out.println("sum of odd numbers using for loop = " + sumOfOdd);

		// sum of odd numbers from 0 to 100 ( 100 is included) using while loop
		int i = 1;
		sumOfOdd = 0;
		while (i <= 100) {
			sumOfOdd += i;
			i += 2;
		}
		System.out.println("sum of odd numbers using while loop = " + sumOfOdd);

		// sum of odd numbers from 0 to 100 ( 100 is included) using do-while loop
		int j = 1;
		sumOfOdd = 0;
		do {
			sumOfOdd += j;
			j += 2;

		} while (j <= 100);

		System.out.println("sum of odd numbers using do-while loop = " + sumOfOdd);

	}

}
