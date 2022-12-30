package corejavaExample.staticdemo;

 class Student {
	String name;
	 int age;
	 String address;
	static String college = "XYZ";
	
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
	
	public String getaddress() {
		return address;
	}
    
}
