package com.java.Stack_LinkedList;

import java.util.LinkedList;

/**
 * LinkedList Implementation using array.
 * @author Sushant
 *
 * @param <E>
 */
public class LinkedList_Stack<E> {
    /* LinkedList that represents stack */
	private LinkedList stack;
	
	/* Constructor */
	public LinkedList_Stack(){
		stack = new LinkedList();
	}
	
	/**
	 * It pushes an element of type E in the stack 
	 * @param e
	 */
	@SuppressWarnings("unchecked")
	public void push(E e){
		stack.addLast(e);
	}
	
	/**
	 * It returns and removes the top element from the stack
	 * @return
	 */
	public E pop(){
		if (stack.size() == 0) return (E) "The stack is empty";
		@SuppressWarnings("unchecked")
		E e = (E) stack.removeLast();
		return e;
	}
	
	/**
	 * It returns the top element from the stack without removing it from the stack
	 * @return
	 */
	public E peek(){
		if (stack.size() == 0) return (E) "The stack is empty";
		@SuppressWarnings("unchecked")
		E e = (E) stack.getLast();
		return e;
	}
	
	/**
	 * This function return the position of the element in respect
	 * to the position of the last element in the stack.
	 * @return
	 */
	public int search(E e){
		if (stack.contains(e)) return (stack.size() - stack.indexOf(e));
		return 0;
	}
}
