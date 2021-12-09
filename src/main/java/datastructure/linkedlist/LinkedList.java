package datastructure.linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	int size;

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
	 *  delete the node in linked list
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
   //check length of node
    public void size() {
        System.out.println("Size of the linked list is : " + size);
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
		obj.insert(40);
		obj.insert(70);
		obj.display();
		obj.size();
		obj.deleteNode(40);
		obj.display();
		obj.size();

	}
}