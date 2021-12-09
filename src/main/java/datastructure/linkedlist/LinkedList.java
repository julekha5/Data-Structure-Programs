package datastructure.linkedlist;

public class LinkedList {
	Node head;
	Node tail;

	/*
	 * create linked list
	 *
	 */
	public void create(int data) {
		Node nextNode = new Node(data);
		if (head == null) {
			head = nextNode;
			tail = nextNode;
		} else {
			tail.next = nextNode;
			tail = tail.next;
		}
	}

	/*
	 * pop the head node
	 * 
	 */

	public void pop() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			head = temp.next;
		}
	}

	/*
	 * show method to display the linked list data
	 */
	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			while (temp != null) {
				System.out.println(temp.data + "->");
				temp = temp.next;
			}
		}
	}

	// main method
	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.create(56);
		obj.create(30);
		obj.create(70);
		obj.display();
		obj.pop();
		obj.display();
	}
}