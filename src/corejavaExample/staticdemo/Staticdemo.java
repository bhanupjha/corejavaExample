package corejavaExample.staticdemo;

public class Staticdemo {

	public static void main(String[] args) {
		
		Student john = new Student("john", 25, "23 East, california");
		
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getaddress());
		System.out.println(Student.college);
		
	}
 }
