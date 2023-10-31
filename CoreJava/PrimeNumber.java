package CoreJava;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        int i = 99;
        List<Integer> list = new ArrayList<>();
        if (i > 2) {
            for (int a = 1; a < i; a++) {
                boolean isValid = true;
                for (int start = 2; start < a; start++) {
                    if (a % start == 0) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    list.add(a);
                }
            }

            list.forEach(System.out::println);
        }
    }
}
