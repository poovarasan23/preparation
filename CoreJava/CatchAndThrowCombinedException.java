package CoreJava;

public class CatchAndThrowCombinedException {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            String s = "1.0";
            try {
                System.out.println(Integer.parseInt(s + a[4]));
            } catch (Exception e) {
                System.out.println("ex 1");
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("ex 2");
        }
    }
}