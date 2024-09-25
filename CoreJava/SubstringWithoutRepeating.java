package CoreJava;

import java.util.*;

public class SubstringWithoutRepeating {
    public static void main(String[] args) {
        String s="abcaabcdab";
        System.out.println(test(s));
    }


    public static int test(String s){
//<< need to understand the bellow -> having less time complexity>>
//        char[] chars = s.toCharArray();
//        boolean[] visited = new boolean[256];
//
//        int maxLength = 0;
//        int left = 0;
//        for (int i = 0; i < chars.length; i += 1) {
//            char ch = chars[i];
//            while (visited[ch]) {
//                visited[chars[left]] = false;
//                left += 1;
//            }
//
//            visited[ch] = true;
//            maxLength = Math.max(maxLength, i - left + 1);
//        }
//
//        return maxLength;

        HashSet<Character> set=new HashSet<>();
        int left=0,out=0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            out=Math.max(out,i-left+1);
        }
        return out;
    }
}
