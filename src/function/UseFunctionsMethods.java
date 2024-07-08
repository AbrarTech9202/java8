package function;

import java.util.function.Function;

public class UseFunctionsMethods {

	public static void main(String[] args) {

		Function<Integer,Integer> function1= str -> 2 * str; 
		Function<Integer, Integer> function2=str2 -> str2 * str2 * str2;
		
		 System.out.println( function1.andThen(function2).apply(2));//2*2=4,4*4*4=64
		 System.out.println(function2.compose(function1).apply(2));
		
		System.out.println("===============");
		
		System.out.println(function2.andThen(function1).apply(2));//2*2*2=8,8*2=16
		System.out.println( function1.compose(function2).apply(2));
		
		Function<String, String> fun=Function.identity();
		System.out.println(fun.apply("Abrar"));
	}

}
