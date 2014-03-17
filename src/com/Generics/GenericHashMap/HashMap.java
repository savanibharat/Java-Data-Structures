package com.Generics.GenericHashMap;

/**
 * This is a generic hash map implementation of the Map ADT.
 */
public class HashMap<K, V> implements Map<K, V> {
	private static final int DEFAULT_SIZE = 11;
    private HashMapEntry<K, V>[] table;
    private int size;
    
    
    public HashMap() {
        this(DEFAULT_SIZE);
    }
    
    
    @SuppressWarnings("unchecked")
    public HashMap(int tableSize) {
        table = new HashMapEntry[tableSize];
        size = 0;
    }
    
    
    public V get(K key) {
        return null;
    }
    
    /** 
     * Associates the specified value with the given key in the map.  If the 
     * key is already present in the map, the old value is replaced with the 
     * new value. 
     */
    public void put(K key, V value) {
        int keyBucket = hash(key);
        
        HashMapEntry<K, V> temp = table[keyBucket];
        while (temp != null) {
            if ((temp.key == null && key == null) 
                    || (temp.key != null && temp.key.equals(key))) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        
        table[keyBucket] = new HashMapEntry<K, V>(key, value, table[keyBucket]);
        size++;
    }


    /**
     * Returns true if the map contains a mapping for the given key.
     */
    public boolean containsKey(K key) {
        int keyBucket = hash(key);
        
        HashMapEntry<K, V> temp = table[keyBucket];
        while (temp != null) {
            if ((temp.key == null && key == null) 
                    || (temp.key != null && temp.key.equals(key))) {
                return true;
            }
            temp = temp.next;
        }
        
        return false;
    }
    
    
    /**
     * Prints the set in a hash table-like format.
     */
    public void print() {
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%d: ", i);
            
            HashMapEntry<K, V> temp = table[i];
            while (temp != null) {
                System.out.print("(" + temp.key + ", " + temp.value + ")");
                
                if (temp.next != null) {
                    System.out.print(" --> ");
                }
                temp = temp.next;
            }
            
            System.out.println();
        }
    }
    

    public V remove(K key) {
    	return null;
    }
    
    
    /**
     * Returns the number of elements in this set (its cardinality)
     */
    public int size() {
        return size;
    }
    
    
    private int hash(K key) {
        if (key == null) {
            return 0;
        } else {
            //return Math.abs(key.hashCode() % this.table.length);
        	return key.hashCode() % this.table.length;
        }
    }
}