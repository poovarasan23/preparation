import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Scratch {
    public static void main(String[] args) {
        Node in = new Node(5, new Node(4, new Node(3, null, null), new Node(2, null, null)), new Node(6, new Node(7, null, null), new Node(8, null, null)));
        List<Integer> out=new ArrayList<>();
        test(in, out);
        out.forEach(System.out::println);
    }

    public static void test(Node in, List<Integer> out){
        while (in!=null){
            test(in.Right,out);
            out.add(in.Val);
            break;
        }
    }
}

class Node {
    int Val;
    Node Right;
    Node Left;
    Node Head;

    public Node(int val, Node right, Node left) {
        Val = val;
        Right = right;
        Left = left;
        Head=null;
        if (right!=null)
            right.Head=this;
        if (left!=null)
            left.Head=this;
    }
}