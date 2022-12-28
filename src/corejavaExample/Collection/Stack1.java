package corejavaExample;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("America");
		stack.push("Germany");
		stack.push("India");
		
		System.out.println("Stack: " +stack);
		
		String PoppedElement = stack.pop();
		System.out.println("popped Element: " +PoppedElement);
		  
		System.out.println("Now the stack look like: " +stack);
		
		String peekedElement = stack.peek();
		System.out.println("Top Element: " +peekedElement);
		
		System.out.println("Now the stack look like: " +stack);
		
		
		
		

	}

}
