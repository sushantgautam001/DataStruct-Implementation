package com.java.LinkedList_Array;

public class Element {

	private Object data;
	private int next;

	public Element(Object data, int next) {
		this.data = data;
		this.next = next;
	}

	public Element() {
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

}
