package com.Queue.WrapAroundQueue;

public class Queue {

	private int maxSize;
	private int[] queueArray;
	private int rear;
	private int front;
	private int nItems;

	public Queue(int maxSize) {

		this.maxSize = maxSize;
		queueArray = new int[this.maxSize];
		front = 0;
		rear = -1;
		nItems = 0;

	}

	public void insert(int value) {

		if (rear == maxSize - 1)// wraparound
			rear = -1;

		queueArray[++rear] = value;
		nItems++;

	}

	public int remove() {

		int temp = queueArray[front++];
		if (front == maxSize)// wraparound
			front = 0;

		nItems--;
		return temp;

	}

	public int peekFront() {

		return queueArray[front];

	}

	public int size() {

		return nItems;

	}

	public boolean isEmpty() {

		return (nItems == 0);

	}

	public boolean isFull() {

		return (nItems == maxSize);

	}

}
