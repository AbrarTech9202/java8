package stream;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

//	List<Integer> list= Arrays.asList(6692,1,2,10,100,2,4,3,3,4,5,6,7,8,92,456,7,8);
//	
//      List<Integer> isEvenNumber = list.stream()
//    		  .map(x -> x/2)
//    		  .distinct()
//    		  .filter(x -> x%2==0)
//    		  .limit(5)
//    		  .sorted((a,b) -> (b-a))
//    		  .limit(15)
//    		  .skip(1)
//    		  .collect(Collectors.toList());
		// System.out.println(isEvenNumber);

		Integer integer = Stream.iterate(3, x -> x + 1).limit(13).sorted((a, b) -> (b - a)).max((a, b) -> a - b).get();
		System.out.println(integer);

	}

}
