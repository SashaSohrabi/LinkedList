import javax.xml.soap.Node;

/**
 * Created by shahab on 7/7/2017.
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void addLast(int val) {
        if (this.next == null) {
            this.next = new ListNode(val);
        } else {
            this.next.addLast(val);
        }
    }

    public void printList() {
        System.out.print( val + "->" );
        if (next != null) {
            this.next.printList();
        } else {
            System.out.println();
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;

        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3=newHead;

        while(p1 != null || p2 != null){
            if(p1 != null){
                carry += p1.val;
                p1 = p1.next;
            }

            if(p2 != null){
                carry += p2.val;
                p2 = p2.next;
            }

            p3.next = new ListNode(carry%10);
            p3 = p3.next;
            carry /= 10;
        }

        if(carry==1)
            p3.next=new ListNode(1);

        return newHead.next;
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        listNode1.addLast(4);
        listNode1.addLast(3);
        listNode1.printList();

        ListNode listNode2 = new ListNode(5);
        listNode2.addLast(6);
        listNode2.addLast(4);
        listNode2.printList();

        ListNode listNode3 = ListNode.addTwoNumbers(listNode1, listNode2);
        listNode3.printList();
    }


}