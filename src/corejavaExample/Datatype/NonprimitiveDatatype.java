package corejavaExample.Datatype;


public class NonprimitiveDatatype{
	public static void main(String[] args) {
		  String str1 = "ABC";
		  System.out.println("string: " +str1);
		  
		  String str2 = new String("ABC");
		  System.out.println("Another string: " +str2);
		  
		  
		  
		  
		int arr[];  
		arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		
		System.out.println("Element at index at 0: " +arr[0]);
		System.out.println("Element at index at 1: " +arr[1]);
		
	}
}
