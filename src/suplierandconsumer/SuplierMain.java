package suplierandconsumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SuplierMain {

	public static void main(String[] args) {

//		//this is use for ony he gave value and dont take any value 
//		Supplier<Integer> sup=()->1;
//		System.out.println(sup.get());
//		
//		//this is use for chek condition
//		Predicate<Integer> predicate=pr -> pr%2==0;
//	
//		//this is use for perform operation
//		Function<String, Integer> function= str -> str.substring(0).length();
//		
//		//this is use only take the value and dont return any value
//		Consumer<Integer> consume= li ->System.out.println(li);
//	
		Predicate<Integer> predicate1=pr -> pr%2==0;
		Function<Integer, Integer> function1= str ->str *str * str;
		Supplier<Integer> sup1=()->10;
		Consumer<Integer> consume2= li ->System.out.println(li);
		
		if(predicate1.test(sup1.get()))
		{
			consume2.accept(function1.apply(sup1.get()));
		}
		else
		{
			System.out.println("not even number");
		}
	}

}
