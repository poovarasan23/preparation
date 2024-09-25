package CoreJava;

import java.util.Arrays;
import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s1 = "bxj##tw";
        String s2 = "bxo#j##tw";
        System.out.println(test(s1).equals(test(s2)));
    }

    public static String test(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='#' && !stack.isEmpty()){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.toString();
    }
}
