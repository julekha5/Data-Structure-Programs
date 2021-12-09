package datastructure.linkedlist;

public class LinkedList {
	Node head;
	Node tail;

	/*
	 * create linked list
	 *
	 */
	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
	}

	/*
	 * Method to insert between two nodes
	 *
	 */
	public void insertBetweenNode(int a, int b, int c) {
		Node newNode = new Node(c);
		Node temp = head;
		while (temp.next != null) {
			if ((temp.data == a && temp.next.data == b) || (temp.data == a && temp.next.data == b)) {
				Node afterc = temp.next;
				temp.next = newNode;
				temp.next.next = afterc;
				break;
			}
			temp = temp.next;
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
		obj.insert(56);
		obj.insert(70);
		obj.display();
		obj.insertBetweenNode(56, 70, 30);
		obj.display();
	}
}