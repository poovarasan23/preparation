package CoreJava;

import java.util.ArrayList;
import java.util.List;

public class LongestContinuousCharacters {
    public static void main(String[] args) {
        String s = "abcabcdabcdef";
        List<String> list = new ArrayList<>();
        String temp = "";
        int x = s.charAt(0);
        temp = temp + s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if ((int) s.charAt(i) == x + 1) {
                temp = temp + s.charAt(i);
                x++;
            } else {
                list.add(temp);
                x = s.charAt(i);
                temp = "";
                temp = temp + s.charAt(i);
            }
        }
        list.add(temp);


        String out = "";
        int a = 0;
        for (String e : list) {
            if (e.length() > a) {
                a = e.length();
                out = e;
            }
        }
        System.out.println(out);
    }
}
