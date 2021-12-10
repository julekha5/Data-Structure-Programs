package datastructure.linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	int size;

	/*
	 * create linked list
	 *
	 */
	public void add(int data) {
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
	 * delete the node in linked list
	 */
	public void deleteNode(int key) {
		if (head == null) {
			System.out.println("Linked List is empty");
		} else {
			Node temp = head;
			if (head.data == key) {
				head = head.next;
				size--;
			}
			while (temp != null && temp.next != null) {
				if (temp.next.data == key) {
					temp.next = temp.next.next;
					size--;
				}
				temp = temp.next;
			}
		}
	}

	// check length of node
	public void size() {
		int size = 0;
		Node current = head;
		if (head == null) {
			System.out.println("Size is 0");
		}
		current = head;
		size = 1;
		while (current.next != null) {
			current = current.next;
			size++;
		}
		System.out.println("List size linked list is:" + size);
	}

	// searchNode() will search for a given node in the list
	public void searchNode(int data) {
		Node current = head;
		int i = 1;
		boolean flag = false;
		// Checks whether list is empty
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (current != null) {
				// Compares node to be found with each node present in the list
				if (current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if (flag)
			System.out.println("Element is present in the list at the position : " + i);
		else
			System.out.println("Element is not present in the list");
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
		obj.add(56);
		obj.add(30);
		obj.add(40);
		obj.add(70);
		obj.display();
		obj.size();
		obj.searchNode(40);
		obj.deleteNode(40);
		obj.display();
		obj.size();

	}
}
