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
	public void sort() {
 	   //node current will point to head
 	   Node current = head,index =null;
 	   int temp;
			if (head == null) {
         return;		
         } else {
				while(current!=null) {
					//node index will point to node next to current
				index = current.next;
				
				while(index!=null) {
					//if current node data is greater than index node data, swap the data between them
					if(current.data>index.data) {
						temp =current.data;
						current.data=index.data;
						index.data=temp;
					}
					index = index.next;
				}
			  current =current.next;	
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
		obj.add(56);
		obj.add(30);
		obj.add(40);
		obj.add(70);
		System.out.println("Linked List Before Sorting ");
		obj.display();
		obj.sort();
		System.out.println("Linked List After Sorting");
		obj.display();

	}
}