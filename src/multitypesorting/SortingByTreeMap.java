package multitypesorting;

import java.util.Map;
import java.util.TreeMap;

public class SortingByTreeMap {

	public static void main(String[] args) {

		Map<Integer,String> map=new TreeMap<>();
		map.put(3,"Khan Abrar");
		map.put(5,"Shadab");
		map.put(1,"Wadood");
		map.put(9,"kasim");
		map.put(7,"Mushahid");
		System.out.println(map);
		
		Map <Integer,String> map1=new TreeMap<>((a,b)-> b- a);
		map1.put(3,"Khan Abrar");
		map1.put(5,"Shadab");
		map1.put(1,"Wadood");
		map1.put(9,"kasim");
		map1.put(7,"Mushahid");
		System.out.println(map1);
		
	}

}
