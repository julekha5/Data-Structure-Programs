package datastructure.linkedlist;

public class LinkedList {
	Node head;
    Node tail;

    /*
     *  append the data in linked list
     *
     */
    public void append(int data) {
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
		obj.append(56);
		obj.append(30);
		obj.append(70);
		obj.display();
	}
}