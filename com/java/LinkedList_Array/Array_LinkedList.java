package com.java.LinkedList_Array;

import java.util.Arrays;

/**
 * This is incomplete.
 * The add and remove function has not been implemented.
 * Also testing of this implementation has not been done.
 * @author Sushant
 *
 * @param <E>
 */

public class Array_LinkedList<E> {
	
	private int DEFAULT_CAPACITY = 10;
	private Element[] linkedList;
	private int size = 0;
	
	public Array_LinkedList(){
		linkedList = new Element[DEFAULT_CAPACITY];
	}
	
	/**
	 * It adds element to the end of the list
	 * @param e
	 * @return
	 */
	public boolean add(Object e){
		if (size == linkedList.length){
			resize();
		}
		Element el = new Element();
		el.setData(e);
		el.setNext(size + 1);
		linkedList[size] = el;
		size = size + 1;
		return true;
	}
	
	/**
	 * It adds an element to a specific position given by index
	 * @param index
	 * @param e
	 */
	public void add(int index, Object e){
		if (size == linkedList.length){
			resize();
		}
		
	}
	
	/**
	 * It retrieves and returns element from the head of the list.
	 * @return
	 */
	public E remove(){
		return null;
	}
	
	/**
	 * It retrieves and returns element from a specific position.
	 * @param index
	 * @return
	 */
	public E remove(int index){
		return null;
	}
	
	/**
	 * It returns the value from a position specified by index.
	 * @param index
	 * @return
	 */
	public Object get(int index){
		if (index >= size){
			return null;
		}
		return linkedList[index].getData();
	}
	
	/**
	 * It returns the length of the linked list.
	 * @return
	 */
	public int size(){
		return size;
	}
	
	/**
	 * It checks if the linked list is empty or not.
	 * @return
	 */
	public boolean isEmpty(){
		if (size == 0) return true;
		return false;
	}
	
	/**
	 * It checks if the list contains an Object or not.
	 * @param o
	 * @return
	 */
	public boolean contains(Object o){
		for (int i = 0; i<size; i++){
			if(o.equals(linkedList[i].getData())){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * It gives the index of particular element in the linked list.
	 * @param o
	 * @return
	 */
	public int indexOf(Object o){
		for(int i = 0; i<size; i++){
			if(o.equals(linkedList[i].getData())){
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * This function resizes the array by double its size;
	 */
	public void resize(){
		int resizeUnit = size * 2;
		linkedList = Arrays.copyOf(linkedList, resizeUnit);
	}
}