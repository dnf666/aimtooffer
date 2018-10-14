package list;

/**
 * created by dailf on 2018/10/3
 *
 * @author dailf
 */
public class TwoSortListToOneSortList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(24);
        ListNode listNode3 = new ListNode(58);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(24);
        ListNode listNode7 = new ListNode(58);
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        ListNode node =  test(listNode,listNode4);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    private static ListNode test(ListNode listNode, ListNode listNode4) {
        ListNode l1 = listNode;
        ListNode l2 = listNode4;
        ListNode ret = new ListNode(0);
        ListNode head = ret;
        while(l1!=null&&l2!=null){
            if (l1.val <= l2.val){
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            }
            else{
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
        }
        if (l1!=null){
            head.next = l1;
        }
        if (l2!= null){
            head.next = l2;
        }
        return ret;
    }
}
