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
    *  delete the last node 
    */
   public void popLastNode() {
       Node temp = head;
       if (head == null) {
           System.out.println("Linked list is empty");
       } else {
           while (temp.next != tail) {
               temp = temp.next;
           }
           temp.next = null;
           tail = temp;
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
		obj.popLastNode();
		obj.display();
	}
}