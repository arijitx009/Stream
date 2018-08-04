import java.util.function.Predicate;

public class LambdaExpression {

	public static Predicate<Integer> isEven() { // To check whether the number is even
		Predicate<Integer> predicate = i -> {
			if (i % 2 == 0)
				return true;
			else
				return false;
		};
		return predicate;
	}

	public static Predicate<Integer> isOdd() { // to check whether the number is odd
		Predicate<Integer> predicate = i -> {
			if (i % 2 == 0)
				return false;
			else
				return true;
		};
		return predicate;
	}

	public static Predicate<Integer> isDivisible_by_6() { // to check whether the numberis divisible by 6
		Predicate<Integer> predicate = i -> {
			if (i % 6 == 0)
				return true;
			else
				return false;
		};
		return predicate;
	}

	public static Predicate<Integer> isless_than_12() { // to check whether the number is divisible by 12
		Predicate<Integer> predicate = i -> {
			if (i < 12)
				return true;
			else
				return false;
		};
		return predicate;
	}

	public static Predicate<Integer> isgreater_than_50() {
		Predicate<Integer> predicate = i -> { // to check whether the number is greater than 50
			if (i > 50)
				return true;
			else
				return false;
		};
		return predicate;
	}

}
