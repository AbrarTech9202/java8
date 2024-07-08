package predicat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatInterfaceJava8 {

	public static void main(String[] args) {

		// SmallerThan And GreaterThan Number
		Predicate<Integer> salaryGreaterThan1Lacs = a -> a > 100000;
		System.out.println(salaryGreaterThan1Lacs.test(10000222));

		// chek start word
		Predicate<String> startWithfirstLetter1 = str -> str.toLowerCase().charAt(0) == 'a';
		System.out.println(startWithfirstLetter1.test("Abrar"));

		// chek both codition true or false using and or method in predicate
		Predicate<String> startWithfirstLetter = str -> str.toLowerCase().charAt(0) == 'a';
		Predicate<String> endtWithfirstLetter = str -> str.toLowerCase().charAt(str.length() - 1) == 'r';
		Predicate<String> and = startWithfirstLetter.and(endtWithfirstLetter);
		System.out.println(and.test("Abrar"));

		// chek string is equal or not using static isEqual method in predicate
		Predicate<String> negate = Predicate.isEqual("Abrar");
		System.out.println(negate.test("Abrar"));

//		Even odd number using java 8
		Predicate<Integer> isEven = x -> x % 2 == 0;
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for (Integer i : numbers) {
			if (!isEven.test(i))

			{
				System.out.println(i);
			}
		}
	}

}
