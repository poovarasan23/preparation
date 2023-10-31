package CoreJava;

public class MultipleInterfacesMCQ {
    public static void main(String[] args) {
    A a=new A();
    a.eat();
    a.fly();
    a.lac();
    }
}

interface X1{
    void eat();
    void fly();
}

interface Y extends X1{
    void eat();
}
interface Z extends X1{
    void lac();
}

class A implements Y,Z{

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void lac() { System.out.println("lac"); }
}