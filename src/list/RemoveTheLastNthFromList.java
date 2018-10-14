package list;

import java.util.List;

/**
 * created by dailf on 2018/10/6
 *
 * @author dailf
 */
public class RemoveTheLastNthFromList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(24);
        ListNode listNode3 = new ListNode(58);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        ListNode result= removeNthFromEnd2(listNode,1);
        while (result!= null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;

        for(int i = 0 ; i<n+1 ; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
