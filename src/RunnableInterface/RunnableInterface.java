package RunnableInterface;

public class RunnableInterface {

	public static void main(String[] args) {
		System.out.println("heellllo");

//		Thread thread=new Thread(main);
//		thread.run();
		
		Runnable runnable=()->{
		for(int i=0;i<=10;i++)
		{
			System.out.println("hiii runnable..");
		}
		Thread thred=new Thread();
		thred.run();
		};
	
	}
}
