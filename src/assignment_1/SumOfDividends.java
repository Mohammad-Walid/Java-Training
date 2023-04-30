package assignment_1;

public class SumOfDividends {

	public static void main(String[] args) {

		// sum of numbers that is dividable by 7 from 0 to 100 ( 100 is included) using
		// for loop
		int sumOfDividends = 0;
		for (int i = 0; i <= 100; i++) {
			sumOfDividends += (i % 7 == 0) ? i : 0;
		}
		System.out.println("Sum of dividends = " + sumOfDividends);

		// sum of numbers that is dividable by 7 from 0 to 100 ( 100 is included) using
		// while loop
		int i = 0;
		sumOfDividends = 0;
		while (i <= 100) {
			sumOfDividends += (i % 7 == 0) ? i : 0;
			i++;
		}
		System.out.println("Sum of dividends = " + sumOfDividends);

		// sum of numbers that is dividable by 7 from 0 to 100 ( 100 is included) using
		// do-while loop
		int j = 0;
		sumOfDividends = 0;
		do {
			sumOfDividends += (j % 7 == 0) ? j : 0;
			j++;
		} while (j <= 100);
		System.out.println("Sum of dividends = " + sumOfDividends);

	}

}
