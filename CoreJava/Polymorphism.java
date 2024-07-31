package CoreJava;

public class Polymorphism {
    public static void main(String[] args) {
/*
Method over-loading
 */
     A1 a=new A1();
     a.print(5);
     a=new B();
     a.print(3);
    }
}
class A1{
    void print(int x){
        System.out.println("P "+x);
    }
    void print(String x){
        System.out.println("P "+x);
    }
}
class B extends A1{
    void print(int x){
        System.out.println("C "+x);
    }
    void print(Float x){
        System.out.println("C "+x);
    }
}