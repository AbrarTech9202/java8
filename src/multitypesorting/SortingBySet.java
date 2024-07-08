package multitypesorting;

import java.util.Set;
import java.util.TreeSet;

public class SortingBySet {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(4);
		set.add(7);
		set.add(0);
		set.add(3);
		System.out.println("orderways output" + set);

		Set<Integer> ss = new TreeSet<>((a, b) -> b - a);
		ss.add(10);
		ss.add(4);
		ss.add(7);
		ss.add(0);
		ss.add(3);
		System.out.println("Decending Order Output" + ss);
	}
}
