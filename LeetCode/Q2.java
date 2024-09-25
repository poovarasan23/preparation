package LeetCode;

public class Q2 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(123);
        ListNode node2 = new ListNode(123);
        String temp1 = test(node1);
        String temp2 = test(node2);
        int out = Integer.parseInt(temp1) + Integer.parseInt(temp2);


        ListNode out1 = new ListNode();


        ListNode dummy = out1;
        if (out == 0){
            out1 = new ListNode();
        }
        else {
            while (out > 0) {
                dummy.next = new ListNode(out % 10);
                dummy = dummy.next;
                out = out / 10;
            }

            out1 = out1.next;
        }

        while (out1 != null) {
            System.out.print(out1.val);
            out1 = out1.next;
        }
    }


    public static String test(ListNode n) {
        String out = "";
        while (n != null) {
            out = String.valueOf(n.val) + out;
            n = n.next;
        }
        return out;
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