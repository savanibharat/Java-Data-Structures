package com.ArrayOperations;

import java.util.ArrayList;
import java.util.Iterator;

public class AIteratorOfIterator<E> implements Iterator<E> {

	Iterator<Iterator<E>> iter;
	Iterator<E> iter2;

	AIteratorOfIterator(Iterator<Iterator<E>> iter) {

		this.iter = iter;
		if (iter.hasNext())
			this.iter2 = iter.next();
	}

	@Override
	public boolean hasNext() {

		if (iter2 != null)
			if (iter.hasNext())
				return true;

		while (iter.hasNext()) {

			iter2 = iter.next();
			if (iter2.hasNext())
				return true;
			return false;
		}
		return false;
	}

	@Override
	public E next() {

		if (iter2 != null)
			if (iter2.hasNext())
				return iter2.next();

		if (iter.hasNext()) {

			iter2 = iter.next();
			return this.next();
		}
		return null;
	}

	@Override
	public void remove() {
	}

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> integers = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 10; i++) {

			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < i; j++) {
				temp.add(j);
				System.out.print(j + " ");
			}
			System.out.println();
			integers.add(temp);
		}
		ArrayList<Iterator<Integer>> iter = new ArrayList<Iterator<Integer>>();
		for (int i = 0; i < integers.size(); i++) {
			iter.add(integers.get(i).iterator());
		}
		Iterator<Iterator<Integer>> iterator = iter.iterator();

		AIteratorOfIterator a = new AIteratorOfIterator<>(iterator);
		while (a.hasNext())
			System.out.print(a.next());
	}

}
