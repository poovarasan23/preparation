class Scratch {
    public static void main(String[] args) {
        int[] in = {5, 3, 6, 1, 12};
        int in1 = 3;
        int temp = in1;
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in.length; j++) {
                if (in[j] == temp) {
                    temp = temp * 2;
                }
            }
        }
        System.out.println(temp);
//==================================Two pointer===============================================
        temp = in1;
        for (int i = 0; i < in.length; i++) {
            int temp1 = in.length % 2 == 0 ? in.length / 2 : (in.length / 2) + 1;
            for (int l = 0, r = in.length - 1; l < temp1; l++) {
                if (in[l] == temp || in[r] == temp) {
                    temp = temp * 2;
                }
                r--;
            }
        }
        System.out.println(temp);
    }
//
//    @Override
//    void check() {
//
//    }
//
//    @Override
//    String ok() {
//        return String.valueOf(test1());
//    }
//
//    @Override
//    public void x() {
//
//    }
//
//    @Override
//    public int y() {
//        return 0;
//    }
//}
//
//abstract class test{
//    abstract void check();
//
//    abstract String ok();
//
//    public int test1() {
//        int x=5;
//        x++;
//        return x;
//    }
//}
//
//interface tes{
//    void x();
//    int y();
}