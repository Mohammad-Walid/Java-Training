package assignment_2;

public class Recursion {

	public static void main(String[] args) {
		System.out.println("sum of even numbers from 0 to 100 = " + even_sum(100) );
		System.out.println("sum of even numbers from 0 to 100 = " + odd_sum(100) );
		System.out.println("sum of numbers that is dividable by 7 from 0 to 100 = " + sum_dividends(100) );
	}
	
	// sum of even numbers from 0 to x(positive) using recursion  
	private static int even_sum(int x) {
		x = Math.abs(x);
		if (x == 0)return x;
		return x % 2 != 0 ? even_sum(x - 1) : x + even_sum(x - 2);
	}
	
	// sum of even numbers from 0 to x(positive) using recursion  
		private static int odd_sum(int x) {
			x = Math.abs(x);
			if (x == 1)return x;
			return x % 2 == 0 ? odd_sum(x - 1) : x + odd_sum(x - 2);
		}
		
	//sum of numbers that is dividable by 7 from 0 to x  using recursion
		private static int sum_dividends(int x){
			x = Math.abs(x);
			return x < 7 ? 0 : (x % 7 == 0 ? x + sum_dividends(x-1) : sum_dividends(x-1));
			//return x % 7 == 0 ? x + sum_dividends(x-1) : sum_dividends(x-1);
		}
	
	

}
