package basicjava8;

public class InterfaceImplClass {

	public static void main(String[] args) {
		
//	  ()->
	 
//		Parent parent=()->"Hello ABrar";
//		System.out.println(parent.sayHello());
		
		Parent p = () -> "Hello";
		System.out.println(p.sayHello());
		
	}

}
