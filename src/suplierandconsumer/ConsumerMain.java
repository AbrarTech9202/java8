package suplierandconsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerMain {

	public static void main(String[] args) {

		Consumer<Integer> consum = son -> System.out.println(son);
		consum.accept(9);

		System.out.println("::::::::😁😁😁😁😁😁😁😁:::::::::::");
		Consumer<List<Integer>> consumer=li ->
		{
			for(Integer i : li)
			{
				System.out.println(i+90);
			}
		};
      consumer.accept(Arrays.asList(1,3,2,4,5,6));
      
      
      System.out.println("::::::::😁😁😁😁😁😁😁😁:::::::::::");
      
      
      Consumer<List<Integer>>consumer2=con->{
    	  for(Integer i : con)
    	  {
    		  System.out.println(i);
    	  }
      };
     Consumer<List<Integer>> andThen = consumer.andThen(consumer2);
     andThen .accept(Arrays.asList(1,2,3,4,5,6));
	}

}
