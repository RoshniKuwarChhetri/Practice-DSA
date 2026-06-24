package practiceSetLinkedList;

public class Middle {
public static Node p(Node head) {
	
	Node slow=head;
	Node fast=head;
	while(slow!=null && fast.next!=null) {
		slow=slow.next;
		fast =fast.next.next;
	}
	return slow;
}
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
}
