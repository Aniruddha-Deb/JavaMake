package dsa;

public abstract class LinkedList<T> {

	protected LinkedListNode<T> head;

	protected LinkedList(LinkedListNode<T> _head) {
		head = _head;
	}
	public abstract void reverse();
	public abstract boolean contains(T data);
	public abstract void addFront(T data);
	public abstract T deleteFront();
	public abstract T getFront();
}

abstract class LinkedListNode<T> {
	
	protected T data;
	protected LinkedListNode<T> next;

	protected LinkedListNode(T data, LinkedListNode<T> next) {
		this.data = data;
		this.next = next;
	}
}
