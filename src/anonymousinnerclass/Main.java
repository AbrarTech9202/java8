package anonymousinnerclass;

public class Main {
	public static void main(String[] args) {

		//this is call anonymous class
		Employee employee = new Employee() {

			@Override
			public int getSalary() {
				return 1234567;
			}

			@Override
			public String getName() {
				return "Abrar";
			}
		};
		System.out.println(employee.getName());
	}
}
