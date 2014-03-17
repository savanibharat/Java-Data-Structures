package com.Generics.GenericHashMap;

public interface Map<K, V> {
    public boolean containsKey(K key);  
    public V get(K key);   
    public void print();
    public void put(K key, V value);
    public V remove(K key);
    public int size();
} 
