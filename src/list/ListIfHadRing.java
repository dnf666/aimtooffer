package list;

/**
 * created by dailf on 2018/9/19
 *
 * @author dailf
 */
public class ListIfHadRing {

    boolean hasCycle(ListNode head){
        if(head == null|| head.next == null){
            return false;
        }
        ListNode slow,fast;
        fast = head.next;
        slow = head;
        while(fast!=slow){
            if(fast==null||fast.next==null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

}
