package unaryandbinaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryNadBinaryOperator {

	public static void main(String[] args) {

		UnaryOperator<Integer> unary= x-> x*x*x;
		System.out.println(unary.apply(5));
		
		System.out.println("::::::::😁😁😁😁😁😁😁:::::::::");
		
		BinaryOperator<String> binary=(str,str2) -> str+str2;
		System.out.println(binary.apply("Abrar","Ayaz"));
	}

}
