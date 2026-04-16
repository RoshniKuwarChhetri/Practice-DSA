package class32;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeTwoSortedLinkedList {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // Dummy node 
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Traverse both list
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next; // return head
    }

    // print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // List 1: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // List 2: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        ListNode result = mergeTwoLists(l1, l2);

        printList(result);
    }
}
/* _____________*______________*_______LEETCODE_______*_________________*____________
   class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy =new ListNode(-1);
        ListNode current=dummy;

        while(list1 !=null && list2 !=null){
            if(list1.val<=list2.val){
               current.next=list1;
               list1=list1.next;
            }
            else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }
        if(list1 !=null){
            current.next=list1;
        }else{
            current.next=list2;
        }
        return dummy.next;
    }
}
 */



