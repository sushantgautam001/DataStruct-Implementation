package com.java.HashMap_Array;

public class KVPair<K, V> {

	private K key;
	private V value;
	
	public KVPair(){
		
	}
	
	public KVPair(K Key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}
