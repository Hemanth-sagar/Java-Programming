package pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {
	
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"Hem"));
		list.add(new Student(100,"agar"));
		list.add(new Student(20,"sankar"));
		
		System.out.print("Before sort: ");
		System.out.println(list);
		
		System.out.print("After sort: ");
		Collections.sort(list);
		System.out.println(list);

	}

}
