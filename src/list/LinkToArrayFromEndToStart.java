package list;

import java.util.ArrayList;
import java.util.List;

/**
 * created by dailf on 2018/9/8
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 *
 * @author dailf
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkToArrayFromEndToStart {
    public static void main(String[] args) {
            ListNode listNode = new ListNode(67);
            ListNode listNode1 = new ListNode(0);
            ListNode listNode2 = new ListNode(24);
            ListNode listNode3 = new ListNode(58);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(printListFromTailToHead(listNode));

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode head = listNode;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;

        }
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for (int i = list.size()-1;i>=0;i--)
        {
            list1.add(list.get(i));
        }
        return list1;
    }
}
