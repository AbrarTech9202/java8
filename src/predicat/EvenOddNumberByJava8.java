package predicat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EvenOddNumberByJava8 {

	public static void main(String[] args) {

		Predicate<Integer> predicate = in -> in < 1000;
		Predicate<Integer> predi = x -> x == 100;

		System.out.println(predicate.test(10));

		System.out.println(predicate.and(predi).test(100));

		
		Predicate<Integer> isEven = Even -> Even % 2 == 0;
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		for (Integer i : listOfNumbers) {
			if (isEven.test(i)) {
				System.out.println(i);
			}
		}

		Predicate<String> acceptValue = str -> str.startsWith("ah");
		System.out.println(acceptValue.negate().test("ahmed"));
	}

}
