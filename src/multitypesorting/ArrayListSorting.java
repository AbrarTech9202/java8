package multitypesorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(4);
		list.add(8);
		list.add(7);
		list.add(5);
		list.add(2);
		System.out.println(" ArrayList" + list);

		Collections.sort(list);
		System.out.println("Asending order" + list);

		Collections.sort(list, (a, b) -> b - a);
		System.out.println("decending order" + list);
	}

}
