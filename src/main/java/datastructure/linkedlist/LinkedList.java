package datastructure.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
    }
}
