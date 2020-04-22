package jsjf;

import jsjf.exceptions.*;
import java.util.Arrays;

/**
 * An array implementation of a stack in which the bottom of the
 * stack is fixed at index 0.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class ArrayStack<T> implements StackADT<T>
{
	private final static int DEFAULT_CAPACITY = 100;

	private int top;  
	private T[] stack;

	/**
	 * Creates an empty stack using the default capacity.
	 */
	public ArrayStack()
	{
		this(DEFAULT_CAPACITY);
	} // end empty-arg constructor

	/**
	 * Creates an empty stack using the specified capacity.
	 * @param initialCapacity the initial size of the array 
	 */
	public ArrayStack(int initialCapacity)
	{
		top = 0;
		@SuppressWarnings("unchecked")
		T[] ts = (T[]) (new Object[initialCapacity]);
		stack = ts;
	} // end preferred constructor

	/**
	 * Adds the specified element to the top of this stack, expanding
	 * the capacity of the array if necessary.
	 * @param element generic element to be pushed onto stack
	 */
	public void push(T element)
	{
		if (size() == stack.length) 
			expandCapacity();

		stack[top] = element;
		top++;
	} // end push

	/**
	 * Creates a new array to store the contents of this stack with
	 * twice the capacity of the old one.
	 */
	private void expandCapacity()
	{
		stack = Arrays.copyOf(stack, stack.length * 2);   
	} // end expandCapacity

	/**
	 * Removes the element at the top of this stack and returns a
	 * reference to it. 
	 * @return element removed from top of stack
	 * @throws EmptyCollectionException if stack is empty 
	 */
	public T pop() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("stack");

		top--;
		T result = stack[top];
		stack[top] = null; 

		return result;
	} // end pop

	/**
	 * Returns a reference to the element at the top of this stack.
	 * The element is not removed from the stack.  
	 * @return element on top of stack
	 * @throws EmptyCollectionException if stack is empty
	 */
	public T peek() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("stack");

		return stack[top-1];
	} // end peek

	/**
	 * Returns true if this stack is empty and false otherwise. 
	 * @return true if this stack is empty
	 */
	public boolean isEmpty()
	{
		if (top != 0)
			return false;
		else
			return true;
	} // end isEmpty

	/**
	 * Returns the number of elements in this stack.
	 * @return the number of elements in the stack
	 */
	public int size()
	{
		return top; 
	} // end size

	/**
	 * Returns a string representation of this stack. 
	 * @return a string representation of the stack
	 */
	public String toString(ArrayStack<T> stack)
	{
		String s = "";
		while (!stack.isEmpty())
			s += stack.pop() + "\n";
		return s; 
	} // end toString

	
} // ArrayStack class

