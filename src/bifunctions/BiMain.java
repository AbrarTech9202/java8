package bifunctions;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiMain {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 || y % 2 == 0;
		if (biPredicate.test(5, 5))
			System.out.println("even number");
		else
			System.out.println("odd number");

		System.out.println(":::::::::😁😁😁😁😁😁::::::::");

		BiPredicate<String, Integer> bi = (str, b) -> str.length() == b;
		System.out.println(bi.test("Abrar", 5));

		System.out.println(":::::::::😁😁😁😁😁😁::::::::");

		BiFunction<String, String, Integer> biFunction = (str, str2) -> str.length() + str.length();
		System.out.println(biFunction.apply("Abrar", "Ahmed"));

		System.out.println(":::::::::😁😁😁😁😁😁::::::::");

		BiConsumer<Integer, Integer> consum = (x, y) -> {
			System.out.println(x + y);
		};
		consum.accept(40, 6);
		
	}

}
