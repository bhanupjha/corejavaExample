package corejavaExample.Datatype;

public class NonprimitiveDatatype{
	
	public static void  main(String[] args) {
		
		String str1 = "ABC";
		System.out.println("String: " +str1);
		
//Another way of creating it	
		String str2 = new String("ABC");
		System.out.println("Another string: " +str2);
		
		
		
//First method
	int arr[];
       arr = new int[2];
       arr[0] = 1;
       arr[1] = 2;
    // arr[2] = 8;  (Array has the size of only of two element. it doesn't have a capacity to store third element)
       
	   System.out.println("Array: " +arr); // printing memory footprint           
       System.out.println("Element in index 0: " +arr[0]);
	   System.out.println("Element in index 1: " +arr[1]);
	 //System.out.println("Element in index 2: " +arr[2]);
	   
//Second Method
	  int array[] = {7,8};
	  	   System.out.println("First element : " +array[0]);
	       System.out.println("Second element: " +array[1]);
	   
	}
}
