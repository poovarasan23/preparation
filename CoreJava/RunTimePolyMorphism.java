package CoreJava;

public class RunTimePolyMorphism {
    public static void main(String[] args) {

        X a = new X();
        int as = 2;
        double b = 3.2;
        a.add(as, as);
        a.add(b, b);
        System.out.println(a.x + " " + a.y);
    }
}


class X {
    int x;
    double y;

    void add(int a, int b) {
        x = a + b;
    }

    void add(double c, double d) {
        y = c + d;
    }

    X() {
        this.x = 0;
        this.y = 0;
    }
}
