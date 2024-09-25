class Scratch {
    public static void main(String[] args) {
        Node in1 = new Node(-9, new Node(3 ));
        Node in2 = new Node(5, new Node(7));

        Node out = mergeTwoLists(in1,in2);
     /*

     Normal approach
        Node out = new Node();
        Node temp = out;
        while (in1 != null && in2 != null) {
            if (in1.val > in2.val) {
                temp.next = in2;
                in2 = in2.next;
            } else {
                temp.next = in1;
                in1 = in1.next;
            }
            temp = temp.next;
        }
        if (in1 != null) {
            temp.next = in1;
        }
        if (in2 != null) {
            temp.next = in2;
        }
        out = out.next;

      */
        while (out != null) {
            System.out.print(out.val);
            out = out.next;
        }

    }

    /*
      Using recursion
     */
    public static Node mergeTwoLists(Node list1,Node list2){
        if(list1 != null && list2 != null) {
            return list1.val > list2.val ?
                    new Node(list2.val, mergeTwoLists(list1, list2.next)) :
                    new Node(list1.val, mergeTwoLists(list1.next, list2));
        } else {
            return list1 == null ? list2 : list1;
        }
    }
}

class Node {
    int val;
    Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}