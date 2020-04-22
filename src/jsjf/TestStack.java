package jsjf;

/**
 * The TestStack class includes a main method and tests the methods from
 * the ArrayStack class directly
 * The methods tested include: both constructors, push, pop, peek, size, isEmpty, toString
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * ArrayStack Project
 * SPRING 2020
 */
public class TestStack {

	public static void main(String[] args) {
		
		//TESTING THE EMPTY-ARG CONSTRUCTOR
		System.out.println("*********************************************");
		System.out.println("         EMPTY-ARG CONTRUCTOR STACK          ");
		System.out.println("*********************************************");
		String x = "34";
		String y = "78";
		ArrayStack<String> as = new ArrayStack<String>(150);
		System.out.println("There are currently " + as.size() + " element(s) in this stack.\n");
		
		//PUSH  IS  TESTED  HERE
				// adding elements to the stack
		as.push(x);
		as.push(y);
		as.push("45");
		
		System.out.println("Now, there are " + as.size() + " element(s) in this stack.\n");
		System.out.println("They are as follows:");
		System.out.println(as.toString(as));
		
		// TESTING THE PREFERRED CONSTRUCTOR
		System.out.println("*********************************************");
		System.out.println("         PREFERRED CONTRUCTOR STACK          ");
		System.out.println("*********************************************");
		String bruh = new String("bruh");
		String bruh2 = new String("bruh2");
		ArrayStack<String> AS = new ArrayStack<String>(150);
		System.out.println("There are currently " + AS.size() + " element(s) in this stack.\n");
		
		//PUSH  IS  TESTED  HERE
				// adding elements to the stack
		AS.push(bruh);
		AS.push(bruh2);
		AS.push("bruh3");
		AS.push("bruh4");
		
		System.out.println("Now, there are " + AS.size() + " element(s) in this stack.\n");
		System.out.println("They are as follows:");
		System.out.println(AS.toString(AS));
		
		//TESTING OTHER METHODS FOUND IN ARRAYSTACK CLASS
		System.out.println("*********************************************");
		System.out.println("            TESTING OTHER METHODS            ");
		System.out.println("*********************************************");
		
		ArrayStack<String> ArrayStack = new ArrayStack<String>(150);
		
		System.out.println("\nIt is " + ArrayStack.isEmpty() + " that ArrayStack is empty.\n");
		
		ArrayStack.push("cat");
		ArrayStack.push("dog");
		ArrayStack.push("bird");
		ArrayStack.push("fish");
		
		System.out.println("The most recent addition to AS was " + ArrayStack.pop() + ", and was just removed.");
		System.out.println("Now, " + ArrayStack.peek() +  " is at the top of the stack.");
		
		System.out.println("\nIt is " + ArrayStack.isEmpty() + " that ArrayStack is empty.");
		
		System.out.println("\nThe current size of the stack is " + ArrayStack.size() + ".");
		System.out.println("The elements are as follows:");
		System.out.println(ArrayStack.toString(ArrayStack));
		
	} // end main method

} // end TestStack class
