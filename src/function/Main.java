package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		Function<String, Integer> function = x -> x.length();
		Function<String, String> function2 = s -> s.substring(0, 2);

		Function<List<Student>, List<Student>> studentAbAsprefix = li -> {
			List<Student> result = new ArrayList<>();
			for (Student student : li) {
				if (function2.apply(student.getName()).equalsIgnoreCase("ab")) {
					result.add(student);
				}
			}
			return result;
		};
		Student student = new Student(1, "Abrar");
		Student student2 = new Student(2, "Ayaz");
		Student student3 = new Student(3, "Abubakar");

		List<Student> Students = Arrays.asList(student, student2, student3);
		List<Student> filterStudents = studentAbAsprefix.apply(Students);
		System.out.println(filterStudents);
		
	}

	public static class Student {
		private int id;
		private String name;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
	}
}
