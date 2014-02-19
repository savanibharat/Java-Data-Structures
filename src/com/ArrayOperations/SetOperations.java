package com.ArrayOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) throws Exception {

        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,2));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(3,2,4,3,2,4,6,7,6,5,7,6));

        System.out.println(new SetOperations().intersection(list1, list2));
        System.out.println(new SetOperations().union(list1, list2));
    }

    public <T> List<T> union(List<T> list1, List<T> list2) {
        Set<T> set = new HashSet<T>();

        set.addAll(list1);
        set.addAll(list2);

        return new ArrayList<T>(set);
    }

    public <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();

        for (T t : list1) {
            if(list2.contains(t)) {
            	if(!list.contains(t))
                list.add(t);
            }
        }

        return list;
    }
}