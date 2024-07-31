package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatternMatching {
    public static void main(String[] args) {
        /*
        input
        String pattern = "100";
        String source = "codesignal";
         */
        String pattern = "010";
        String source = "amazing";
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');
        List<String> out = new ArrayList<>();

        for (int i = 0; i < source.length() - pattern.length(); i++) {
            boolean op = false;
            String temp = "";
            for (int j = 0; j < pattern.length(); j++) {
                if (pattern.charAt(j) == '0') {
                    op = vowels.contains(source.charAt(i + j));
                } else {
                    op = !(vowels.contains(source.charAt(i + j)));
                }
                if (!op) break;
                temp += source.charAt(i + j);
            }
            if (op) {
                out.add(temp);
            }
        }
        System.out.println(out.size());
        out.forEach(System.out::println);
    }
}
