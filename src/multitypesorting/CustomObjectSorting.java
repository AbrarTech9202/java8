package multitypesorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hello [id=" + id + ", name=" + name + "]";
	}

}

public class CustomObjectSorting {

	public static void main(String[] args) {

		Student student=new Student(7,"Abrar");
		Student student1=new Student(3,"Abrar");
		Student student2=new Student(10,"Abrar");
		
		List<Student> lis1t=new ArrayList<>();
		lis1t.add(student);
		lis1t.add(student1);
		lis1t.add(student2);
		
		System.out.println("natural order"+lis1t);
		
		Collections.sort(lis1t, (a,b)-> a.id - b.id);
		System.out.println("Assending  order"+lis1t);
		
		List<Student> list=new ArrayList<>();
		list.add(student);
		list.add(student1);
		list.add(student2);
		
//		System.out.println(list);
		
		Collections.sort(list, (a,b)-> b.id - a.id);
		System.out.println("Assending  order"+list);
		
	}

}
