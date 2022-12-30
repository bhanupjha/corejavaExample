package corejavaExample.StaticnestedClasses;

public class OuterClass {
 static int outerStaticMember = 10;
	 
	 int instanceMember = 20; // It is a non static variable
	 
	 private static int outerprivateMember = 30;
	 
	 static class StaticNestedClass {
		 void display() {
			 System.out.println("Static member of outer class = " + outerStaticMember );
			 System.out.println("Private static member of outer class = " + outerprivateMember);
			 
			 /*A static method or blog can only accessed static variable. A static blog will not be able to 
			 accessed non static variable*/
		//	 System.out.println("Non static member of outer class = " + instanceMember);
			 
		 }

	 }
}