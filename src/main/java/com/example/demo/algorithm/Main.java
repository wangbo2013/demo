package com.example.demo.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void reorderList(ListNode head) {
        //  编写你的代码
        if (head == null) {
            return;
        }

        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode cur = slow.next, pre = null, next = null;
        slow.next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        ListNode p1 = head,p2 = pre;
        while (p1 != null && p2 != null) {
            next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = next;
        }
    }


    public static void main(String[] args){
        ListNode listNode;
        Scanner in = new Scanner(System.in);
        int treeNodeSize = Integer.parseInt(in.next());
        List<ListNode> listNodeList = new ArrayList<>();
        for (int i = 0; i < treeNodeSize; i++) {
            int val = Integer.parseInt(in.next());
            listNode = new ListNode();
            listNode.val = val;
            if (listNodeList.size() > 0) {
                listNodeList.get(i - 1).next = listNode;
            }
            listNodeList.add(listNode);
        }
        reorderList(listNodeList.get(0));
        ListNode node = listNodeList.get(0);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


