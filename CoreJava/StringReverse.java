package CoreJava;

public class StringReverse {
    public static void main(String[] args) {
        String in="Poovarasan";
        for (int i = in.length()-1; i >=0; i--) {
            System.out.print(in.charAt(i));
        }
    }
}
