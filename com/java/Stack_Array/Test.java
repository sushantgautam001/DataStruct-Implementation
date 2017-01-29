package com.java.Stack_Array;

public class Test {
	
	public static void main(String[] args){
		Array_Stack<String> stk = new Array_Stack<String>();
		stk.pop();
		stk.push("a");
		stk.push("b");
		stk.push("c");
		System.out.println("Poping: " + String.valueOf(stk.pop()));
		stk.push("d");
		stk.push("e");
		stk.push("f");
		stk.push("g");
		System.out.println("Poping: " + String.valueOf(stk.pop()));
		System.out.println("Poping: " + String.valueOf(stk.pop()));
		System.out.println("Peeking: " + String.valueOf(stk.peek()));
		System.out.println("Searching b: " + String.valueOf(stk.search("b")));
		System.out.println("Searching c: " + String.valueOf(stk.search("c")));
		//System.out.println("Pushing");
		//stack.pop();
		
	}
	
}
