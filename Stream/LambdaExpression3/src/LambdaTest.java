import java.util.ArrayList;
import java.util.List;

//driver program to implement the code
public class LambdaTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			list.add(i);
		}
		System.out.println("Displaying the List : ");
		list.stream().forEach(System.out::println);
		System.out.println("\nEven Numbers in 1-100");
		list.stream().filter(LambdaExpression.isEven()).forEach(System.out::println);
		System.out.println("\nOdd Numbers in 1-100");
		list.stream().filter(LambdaExpression.isOdd()).forEach(System.out::println);
		System.out.println("\nAll NUmbers divisible by 6 in 1-100");
		list.stream().filter(LambdaExpression.isDivisible_by_6()).forEach(System.out::println);
		System.out.println("\nAll NUmbers less than 12 in 1-100");
		list.stream().filter(LambdaExpression.isless_than_12()).forEach(System.out::println);
		System.out.println("\nAll NUmbers greater than 50 in 1-100");
		list.stream().filter(LambdaExpression.isgreater_than_50()).forEach(System.out::println);
	}

}
