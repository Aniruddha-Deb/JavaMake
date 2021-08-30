package dsa.tests;

import dsa.SinglyLinkedList;
import dsa.LinkedList;

public class SinglyLinkedListTest {
	
	public static void main(String args[]) {
		
		LinkedList<Integer> sll = new SinglyLinkedList<>(0);
		sll.addFront(5);
		sll.addFront(2);
		sll.deleteFront();
		System.out.println(sll);

	}
}
