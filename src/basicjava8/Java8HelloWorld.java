package basicjava8;

interface Hello {
//	void hello();
	int sum(int a, int b);
}

public class Java8HelloWorld {
	public static void main(String[] args) {
		
//		Hello h = (a,b)-> a+b;
//		System.out.println(h.sum(10, 10));
		
		Hello hi = (a, b) -> {	
			if (a > b) {
				throw new RuntimeException("a is not greater than b");
			} else {
				return a + b;
			}
		};
		
		System.err.println(hi.sum(10, 10));
		
//		Hello h = () -> System.out.println("hello ");
//		h.hello();
	}
}
