package function;

import java.util.function.Function;

public class FunctionPractice {

	public static void main(String[] args) {

		Function<Integer,Integer> function1= x -> x* 2;
		Function<Integer, Integer> function2= f2 -> f2* f2* f2;
		
	
		
	System.out.println(function1.andThen(function2).apply(4));
	System.out.println(function2.compose(function1).apply(4));
	
	System.out.println("=============");
	
	System.out.println(function2.andThen(function1).apply(4));		
	System.out.println(function1.compose(function2).apply(4));
		
	  Function<Object, Object> identity = Function.identity();
	  System.out.println(identity.apply("Abrar"));
	}

}
