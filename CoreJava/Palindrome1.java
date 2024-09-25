package CoreJava;


public class Palindrome1 {
    public static void main(String[] args) {
        Sol sol = new Sol();
        String s= "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        boolean out = sol.isPalindrome(s);
        System.out.println(out? out: sol.isPalindrome1(s));
    }
}

class Sol {

    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int right = c.length - 1;
        int left = 0;
        int count = 0;
        boolean out = true;
        while (left < right) {
            if (!out) break;
            out = false;
            if (c[left] == c[right]) {
                out = true;
            }else if (c[++left] == c[right] && count < 1) {
                out = true;
                count++;
            } else if (c[--left] == c[--right] && count < 1) {
                out = true;
                count++;
            }
            left++;
            right--;
        }
        return out? out: isPalindrome1(s);
    }

    public boolean isPalindrome1(String s) {
        char[] c = s.toCharArray();
        int right = c.length - 1;
        int left = 0;
        int count = 0;
        boolean out = true;
        while (left < right) {
            if (!out) break;
            out = false;
            if (c[left] == c[right]) {
                out = true;
            }else if (c[left] == c[--right] && count < 1) {
                out = true;
                count++;
            }else if (c[++left] == c[++right] && count < 1) {
                out = true;
                count++;
            }
            left++;
            right--;
        }
        return out;
    }


//        char[] c = s.toLowerCase().toCharArray();
//        StringBuilder temp = new StringBuilder();
//        for (int i = 0; i < c.length; i++) {
//            if (((int) c[i] >= 97 && (int) c[i] <= 122) || (c[i] >= 48 && c[i] <= 57)) {
//                temp.append(c[i]);
//            }
//        }
//        return temp.toString().contentEquals(temp.reverse());
//    }
}