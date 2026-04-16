package class29;


class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
		
	}
}

public class CreatingLinkedList {
	static Node head;
	public static void add(int data) {
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
		}
		Node currentNode=head;
		while(currentNode.next!=null) {
			currentNode.next=newNode;
		}
		currentNode.next=newNode;
	}
	public static void main(String[] args) {
		CreatingLinkedList l1=new CreatingLinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
	}
}
