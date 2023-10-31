package CoreJava;

public class Palindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        int left = 0, right = str.length() - 1;
        boolean isValid = true;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                isValid = false;
                break;
            }
        }
        System.out.println(isValid ? "CoreJava.Palindrome" : "Not CoreJava.Palindrome");
    }
}
