package com.java.HashMap_Array;

/**
 * This class is an implementation of hashmap using array.
 * The remove function of HashMap is yet to be finished.
 * Also the testing of this implementation has not been done. 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array_HashMap<K, V> {

	private int size;
	private int DEFAULT_CAPACITY = 10;
	private KVPair<K, V>[] hashMap;

	public Array_HashMap() {
		size = 0;
		hashMap = new KVPair[DEFAULT_CAPACITY];
	}

	/**
	 * This function gets the value of the specified key.
	 * @param key
	 * @return
	 */
	public V get(Object key) {
		for (int i = 0; i < hashMap.length; i++) {
			if (hashMap[i] != null) {
				if (hashMap[i].getKey().equals(key)) {
					return hashMap[i].getValue();
				}
			}
		}
		return null;
	}

	/**
	 * This function adds the key value pair to the hashmap.
	 * If the key already exists in the hashmap than it overrides the existing value 
	 * and return it.
	 * If the key doesn't exist in the hashmap than it insert the pair to the hashmap.
	 * @param key
	 * @param value
	 * @return
	 */
	public V put(K key, V value) {
		if (hashMap.length == size) {
			resize();
		}
		boolean contains = true;
		
		for (int i = 0; i < hashMap.length; i++) {
			if (hashMap[i] != null) {
				if ((hashMap[i].getKey().equals(key))) {
					hashMap[i].setValue(value);
					contains = false;
					return hashMap[i].getValue();
				}
			}
		}
		if (contains){
			hashMap[size] = new KVPair(key, value);
			size = size + 1;
		}
		return null;
	}

	/**
	 * This function checks if the hashmap contains the given key or not.
	 * @param key
	 * @return
	 */
	public boolean contains(Object key) {
		for (int i = 0; i < hashMap.length; i++) {
			if (hashMap[i] != null) {
				if ((hashMap[i].getKey().equals(key))) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * This function return the hashMap as Set<KVPair<K,V>> with all the key value pair.
	 * @return
	 */
	public Set<KVPair<K,V>> entrySet() {
		return (Set<KVPair<K, V>>) Arrays.asList(hashMap);
		
	}

	/**
	 * This function returns all the values of the hashMap.
	 * @return
	 */
	public Collection<V> values() {
		List valueList = new ArrayList();
		for (int i = 0; i<hashMap.length; i++){
			if(hashMap[i] != null){
				valueList.add(hashMap[i].getKey());
			}
		}
		return valueList;
	}

	/**
	 * This function returns the keySet of the hashMap.
	 * @return
	 */
	public Set<K> keySet() {
		Set keySet = new HashSet();
		for (int i = 0; i<hashMap.length; i++){
			if(hashMap[i] != null){
				keySet.add(hashMap[i].getKey());
			}
		}
		return keySet;
		
	}

	/**
	 * This function return the size of the hashmap.
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	public void resize() {
		int sizeUnit = size * 2;
		hashMap = Arrays.copyOf(hashMap, sizeUnit);
	}
	
	private void condenseArray(int start) {
	    for (int i = start; i < size; i++) {
	      hashMap[i] = hashMap[i + 1];
	    }
	  }


}
