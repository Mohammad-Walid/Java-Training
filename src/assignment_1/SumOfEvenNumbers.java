package assignment_1;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		// sum of even numbers from 0 to 100 ( 100 is included) using for loop
		int sumOfEven = 0;
		for (int i = 0; i <= 100; i += 2) {
			sumOfEven += i;
		}
		System.out.println("sum of even numbers using for loop = " + sumOfEven);
		
		// sum of even numbers from 0 to 100 ( 100 is included) using while loop
		int i = 0;
		sumOfEven = 0;
		while (i <= 100) {
			sumOfEven += i;
			i +=2;
		}
		System.out.println("sum of even numbers using while loop = "+ sumOfEven);
		
		// sum of even numbers from 0 to 100 ( 100 is included) using do-while loop
		int j = 0;
		sumOfEven = 0;
		do {
			sumOfEven += j;
			j +=2;
			
		}while (j <= 100);
		
		System.out.println("sum of even numbers using do-while loop = "+ sumOfEven);
	}
}
