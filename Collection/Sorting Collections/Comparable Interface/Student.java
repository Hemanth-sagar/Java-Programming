package pkg1;

public class Student implements Comparable<Student> {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	 public String toString() {
		 return id + " " + name;
	 }
	@Override
	public int compareTo(Student that) {

		return Integer.compare(this.id, that.id);
//		for reverse order
//		return Integer.compare(that.id, this.id);
	}
	
}
