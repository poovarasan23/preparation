package CoreJava;

public class CatchAndThrowCombinedException {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            String s = "123.0";
            try {
                System.out.println(Integer.parseInt(s+ a[4] ));
                /*
                parseInt will accept only whole integer string.As the string is decimal here, it is throwing exception.
                If String is whole integer "+" will concatenate the values before phrasing
                 */
            } catch (Exception e) {
                System.out.println("ex 1");
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("ex 2");
        }
    }
}