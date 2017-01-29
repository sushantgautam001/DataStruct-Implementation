package com.java.Stack_Array;

import java.util.Arrays;
import java.util.List;

/**
 * Stack Implementation using array.
 * @author Sushant
 *
 * @param <E>
 */

public class Array_Stack<E> {
	/* stack is an array which holds the element in the stack. */
	private Object[] stack;
	/* top gives the index of the recent element pushed in the stack */
	private int top = 0;
	/* DEFAULT_CAPACITY defines the size of the stack */
	private int DEFAULT_CAPACITY = 10;
	
	public Array_Stack(){
		this.stack = new Object[DEFAULT_CAPACITY];
	}
	
	/**
	 * It pushes an element of type E in the stack 
	 * @param e
	 */
	public void push(E e){
		if (top == stack.length){
			resize();
		}
		stack[top] = e; 
		System.out.println("Pushing: " + String.valueOf(stack[top]));
		top = top + 1;	
	}
	
	/**
	 * It returns and removes the top element from the stack
	 * @return
	 */
	public E pop(){
		if (top == 0){
			return null;
		}
		E e = (E) stack[top-1];
		stack[top-1] = null;
		top = top -1;
		return e;
	}
	
	/**
	 * It returns the top element from the stack
	 * @return
	 */
	public E peek(){
		if (top == 0){
			return null;
		}
		return (E) stack[top-1];
	}
	
	/**
	 * This function return the position of the element in respect
	 * to the position at the top of the stack
	 * @return
	 */
	public int search(E e){
		String val = (String) e;
		for (int i=0; i<stack.length; i++ ){
			if (stack[i] == null){
				continue;
			}
			if (stack[i].equals(val)) return (top-i);
		}
		return -1;
	}
	
	/**
	 * It resizes the array by 2 if the current size is not enough.
	 */
	public void resize(){
		stack = Arrays.copyOf(stack, stack.length * 2);
	}

}
