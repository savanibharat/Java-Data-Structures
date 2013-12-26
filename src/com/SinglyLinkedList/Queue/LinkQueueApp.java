package com.SinglyLinkedList.Queue;

public class LinkQueueApp {

	public static void main(String[] args) {
		
		LinkQueue theLink =new LinkQueue();
		theLink.insert(10);
		theLink.insert(20);
		theLink.insert(30);
		theLink.insert(40);
		theLink.displayQueue();
	
		theLink.remove();
		theLink.displayQueue();
		
		theLink.remove();
		theLink.displayQueue();
		
		theLink.remove();
		theLink.displayQueue();
	}
}
