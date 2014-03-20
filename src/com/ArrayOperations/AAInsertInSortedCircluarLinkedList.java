package com.ArrayOperations;

public class AAInsertInSortedCircluarLinkedList {

}
/**
 * void insert(Node node, int x) {
  if (node == null) {
    node = new Node(x);
    node.next = node;
    return;
  }
  Node nextP = node; // To move forward
  Node prevP = NULL; // To hold pointer on previous node
  do {
    prev = nextP;
    nextP = nextP.next;
    if (x <= nextP.data && x >= prevP->data){
		//If value resides between two values of nextP & prevP, add here
		break;
	}
    if ((prevP.data > nextP.data) && (x < nextP.data || x > prevP.data)) {
	//If node x is largest (larger than all elements in the list) 
	//or smallest (smaller than all elements in the list)
		break;
	}
  } while (nextP != node);

  Node newNode = new Node(x);
  newNode.next = nextP;
  prevP.next = newNode;
}
 */
