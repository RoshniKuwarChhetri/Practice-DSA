package practiceSetLinkedList;

public class Reverse {

class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}

public static Node P(Node head) {
	Node prev=null;
	Node curr=head;
	
	while(curr!=null) {
		
		Node next=curr.next;
		curr.next=prev;
		
		prev=curr;
		curr=next;
	}
	return prev;		
}
}
