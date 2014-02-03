package com.RobertLafore.SingleLinkedList;

public class LinkListApp {

	public static void main(String args[]) {

		LinkList theLinkList = new LinkList();
		theLinkList.insertFirst(11, 1.1);
		theLinkList.insertFirst(22, 2.2);
		theLinkList.insertFirst(33, 3.3);
		theLinkList.insertFirst(44, 4.4);
		theLinkList.insertFirst(14, 4.4);
		theLinkList.insertFirst(22, 4.4);
		theLinkList.insertFirst(43, 4.4);
		theLinkList.insertFirst(17, 4.4);
		theLinkList.insertFirst(19, 4.4);
		theLinkList.insertFirst(32, 4.4);
		
		theLinkList.displayList();
		theLinkList.sort();
		theLinkList.displayList();
		/*Link f = theLinkList.find(22);
		if (f != null)
			System.out.println("Found link");
		else
			System.out.println("Cant find");

		f = theLinkList.delete(22);
		if (f != null)
			System.out.println("22 deleted");
		else
			System.out.println("Cannot find 22");
		
		 * System.out.println(); System.out.println("Deletion begins");
		 * System.out.println(); while(!theLinkList.isEmpty()){
		 * 
		 * Link aLink=theLinkList.deleteFirst(); System.out.print("Deleted");
		 * aLink.display(); System.out.println(" ");
		 * 
		 * }
		 
		theLinkList.displayList();
*/
	}
}
