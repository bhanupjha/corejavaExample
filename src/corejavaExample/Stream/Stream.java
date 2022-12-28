package corejavaExample;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Stream {

	public static void main(String[] args) {
     
		List<Integer>numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
//	List<Integer>SquareList = new ArrayList<>();
//	for(Integer i : numbersList) {
//		SquareList.add(i*i);
//	}
	
	 List<Integer>squareList = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
     System.out.println("List of squared numbers: " +squareList);
     
//		Set<Integer> squareSet = new HashSet<>();
//		for(Integer i : numbersList) {
//			squareSet.add(i*i);
//		}
     
     Set<Integer> squareSet = numbersList.stream().map(x -> x*x).collect(Collectors.toSet());
     System.out.println("Set of squared numbers: " +squareSet);
     
        //Stream filter in java
       
     List<String>languages = new ArrayList<>();
     languages.add("java");
     languages.add("python");
     languages.add("scalar");
     languages.add("basic");
     
//     List<String>filterResult = new ArrayList<>();
//     for(String s: languages) {
//    	 if(s.startsWith("p")) {
//    		 filterResult.add(s);
//    	 } 
//     }
    
        List<String>filterResult = languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
        System.out.println("Languages starting with 'p': " +filterResult);
     
     List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
     System.out.println("Languages are sorted alphabetically: " + sortedList);
  
       //Demonstration of forEach method
     
      System.out.println("printing all elements one by one: ");
      numbersList.stream().map(x -> x*x).forEach(y -> System.out.println("element is: " +y));
     
      //Demonstration of reduce method
     
/*   Identity: An element that is the final value of the reduction operation and  the default result if the stream is empty.
    
     Accumulator: A function that takes two parameters:
                A partial result of the reduction operation and the next element of the stream. 
                 
     Combiner: A function used to combine the partial result of the reduction operation when the reduction is
               parallelized or when there is mismatch between the types of accumulator arguments and the types of the 
               accumulator implementation.           
*/
     int sum = 
    		 numbersList.stream().reduce(0,(ans, i)-> ans+i);
     System.out.println("Sum of all the elements in the numbers list: " +sum);
    		    
	}

}
