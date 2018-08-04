package LambdaE;

import java.util.function.Predicate;

public class LambdaExpression {
	public static Predicate<Integer> isOdd() {			//function to check whether the number is odd or not
		Predicate<Integer> predicate = i -> {
		if (i % 2 == 0)
		return false;
		else
		return true;
		};
		return predicate;
		}
		public static Predicate<Integer> isPrime() {			//function to check whether the number is prime 
		Predicate<Integer> predicate = i -> {
		for (int j = 2; j < i; j++) {
		if (i % j == 0)
		return false;
		}
		return true;
		};
		return predicate;
		}
		public static Predicate<Integer> isPalindrome() {			//function to check whether the number is palindrome
		Predicate<Integer> predicate = i -> {
		int Initial = i;
		int sum = 0;
		while (i != 0) {
		int k = i % 10;
		sum = (sum * 10) + k;
		i = i / 10;
		}
		if (Initial == sum)
		return true;
		else
		return false;
		};
		return predicate;
		}
}
