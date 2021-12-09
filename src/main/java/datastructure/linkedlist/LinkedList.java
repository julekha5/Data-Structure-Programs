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
	 * Method is used to insert the node in linked list
	 */
	public void insertAfter(int insertAfter, int insertData) {
		Node temp = head;
		Node insertNode = new Node(insertData);
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			while (temp != null) {
				if (temp.data == insertAfter) {
					Node node = temp.next;
					temp.next = insertNode;
					insertNode.next = node;
					temp = node;
				} else {
					temp = temp.next;
				}
			}
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
		obj.insert(30);
		obj.insert(70);
		obj.display();
		obj.insertAfter(30,40);
		obj.display();

	}
}