package methodrefrenceandmethodconstructor;

import java.util.Arrays;
import java.util.List;

public class MethodRefrence {

	public static void screen(String s)
	{
	System.out.println(s);	
	}
	
	public static void main(String[] args) {
  
		List<String> student= Arrays.asList("Abrar","Ayaz","Kaif","Khan");
		student.forEach(MethodRefrence::screen);//using method refrence :: operator
		System.out.println("::::::::😁😁😁😁😁😁😁:::::::");
		student.forEach(x-> System.out.println(x));//using lemda expression 
		
	}

}
