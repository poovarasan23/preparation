package CoreJava;

public class SinglyListNode {
    public static void main(String[] args) {
        ListNode list1=new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode list2=new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode out=mergeTwoLists(list1,list2);
        while(out != null){
            System.out.print(out.val);
            out=out.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }

        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
