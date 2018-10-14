package list;

/**
 * created by dailf on 2018/9/19
 *
 * @author dailf
 */
public class ReverseLinkList {
    public static ListNode reverseLinkedList(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        } else {
            ListNode headNode = reverseLinkedList(node.next);
            node.next.next = node;
            node.next = null;
            return headNode;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(67);
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(24);
        ListNode listNode3 = new ListNode(58);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        ListNode node = reverseLinkedList(listNode);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
