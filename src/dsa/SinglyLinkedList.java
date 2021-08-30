package dsa;

public class SinglyLinkedList<T> extends LinkedList<T> {
	
	public SinglyLinkedList(T data) {
		super(new SinglyLinkedListNode<T>(data, null));
	}

	public void reverse() {
		if (head == null) return;
		LinkedListNode<T> head = this.head;
		LinkedListNode<T> newHead = head.next;
		head.next = null;
		while (newHead != null) {
			LinkedListNode<T> temp = newHead.next;
			newHead.next = head;
			head = newHead;
			newHead = temp;
		}
	}

	public boolean contains(T data) { 
		LinkedListNode<T> node = this.head;
		while (node != null && !node.data.equals(data)) {
			node = node.next;
		}
		if (node == null) return false;
		return true;
	}
		
	public void addFront(T data) {
		LinkedListNode<T> frontNode = new SinglyLinkedListNode<T>(data, (SinglyLinkedListNode<T>)this.head);
		this.head = frontNode;
	}

	public T deleteFront() {
		LinkedListNode<T> front = this.head;
		this.head = this.head.next;
		return front.data;
	}
	
	public T getFront() {
		return this.head.data;
	}
	
	public String toString() {
		LinkedListNode<T> node = this.head;
		StringBuilder output = new StringBuilder();
		while (node != null) {
			output.append(node.toString());
			output.append(" -> ");
			node = node.next;
		}
		output.append("|");
		return output.toString();
	}
	
}

class SinglyLinkedListNode<T> extends LinkedListNode<T> {
	
	public SinglyLinkedListNode(T data, SinglyLinkedListNode<T> next) {
		super(data, next);
	}

	public String toString() {
		return this.data.toString();
	}
}
