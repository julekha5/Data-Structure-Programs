package datastructure.linkedlist;

public class LinkedList {
	Node head;

	/*
	 * method to add linked list, push as first node will be the last node
	 * 
	 * @param data integer to be added in linked list
	 */
	public void addNodeMethod(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			head = newNode;
			newNode.next = temp;
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
		obj.addNodeMethod(70);
		obj.addNodeMethod(30);
		obj.addNodeMethod(56);
		obj.display();
	}
}