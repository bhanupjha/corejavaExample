package corejavaExample;

public class Student {
	
	String name;
	int age;
	String address;
	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void Setaddress(String address) {
		this.address = address;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
//	public String toString() {
//		return("Student name is: " +this.getName() + ", age is: " +this.getAge()+ " And address is: " + this.getAddress());
//	}
	
	public static void main(String[] args) {
	Student john = new Student("john",25,"23East,california");
	
	//System.out.println(john.toString());
	
	System.out.println(john.getName());
	System.out.println(john.getAge());
	System.out.println(john.getAddress());
	}

}
