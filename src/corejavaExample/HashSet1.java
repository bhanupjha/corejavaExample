package corejavaExample;

import java.util.*;


public class HashSet1 {

	public static void main(String[] args) {
		
	Set<String>hashset =new HashSet<>();
		
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("C");
		
		System.out.println(hashset);
		
		System.out.println("Set contains c or  not? " +hashset.contains("c"));
	
    	hashset.remove("A");
	   System.out.println("Set after removing A: " +hashset);
	

//		for(String item: HashSet) {
//			System.out.print(item);
//		}   
	}

}
