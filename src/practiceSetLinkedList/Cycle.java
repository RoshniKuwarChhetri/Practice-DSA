package practiceSetLinkedList;

public class Cycle {
	public static boolean p(Node head) {
		Node slow=head;
		Node fast=head;
		
		while(slow!=null && slow.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
		
		if(slow==fast) {
			return true;
		}
		return false;
	}
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
}

