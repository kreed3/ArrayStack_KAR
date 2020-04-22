package jsjf;

import java.util.Scanner; 

/**
 * The Application class includes a main method as well as a reverseString method
 * The main method demonstrates the reverseString method
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * ArrayStack Project
 * SPRING 2020
 */
public class Application {
	
	public static void main(String[] args) {
		String play = "Y"; // used to determine whether the user wishes to continue
		String desiredString; // represents the chosen string of the user
		
		Scanner input = new Scanner(System.in); // allows user to input info
		
		//starts the "game"
		while (play.equalsIgnoreCase("Y")) {
		
			//requests sentence from user
			System.out.print("Type a sentence: ");
			desiredString = input.nextLine();
		
			// prints the reversed version of the sentence ***uses reverseString method***
			System.out.println("Reversed: " + reverseString(desiredString)); 
	
			// asks if the user wishes to repeat the process
			System.out.print("\nWould you like to enter another sentence?\n"); 
		
			// changes play variable according to user response
			play = input.nextLine();
		
		} 
		
		// signifies end of program
		System.out.println("<GOODBYE>");
		
		input.close();
	} // end main method
	
	/**
	 * The reverseString method uses stacks and arrays to get the letters of 
	 * each word of the chosen sentence to be reversed.
	 * 
	 * @param s: represents the string input of the user
	 * @return str: the reversed version of the initial string s
	 */
	public static String reverseString(String s) {
		String str = ""; // will be used as the string returned at the end
		
		// creates an empty character stack 
		ArrayStack<Character> stack = new ArrayStack<Character>();
		
		// converts the user's string into a character array
		char[] chars = s.toCharArray();
		
		// fills the character stack with the elements from the character array
		for(int i = 0; i < s.length(); i ++)
			stack.push(chars[i]);
		
		// uses the pop method to replace the chars in the array so they are in reverse order.
		// at this point the entire string is reversed
		int h = 0;
		while (!stack.isEmpty()) {
			chars[h] = stack.pop();
			h++;
		}
		
		// char array is converted back to a string
		String newOne = String.copyValueOf(chars);
		// the string is then split by the spaces and assigned to a string array
		String[] newWords = newOne.split(" ");
		
		// a new string stack is created
		ArrayStack<String> stack2 = new ArrayStack<String>();
		
		// the words from the new string array are pushed to the stack
		for(int i = 0; i < newWords.length; i ++)
			stack2.push(newWords[i]);
		
		// uses the pop method to replace the reversed words in the string array
		// now the words are back in order but the letters are still reversed
		int j = 0;
		while (!stack2.isEmpty()) {
			newWords[j] = stack2.pop();	
			j++;
		}
		
		// the strings just put back into the array are added to str and separated by spaces
		for(int i = 0; i < newWords.length; i++)
			str += newWords[i] + " ";
		
		// the final string with only the letter reversed and the words in order is returned
		return  str;	
		
	} // end reverseString
	
} // end Application