package CoreJava;

public class PassingInterfaceAsParameter {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        String result = myClass.foo2((s,x,y)->s+" "+(x+y),"poo",2,3);
        System.out.println(result);
    }
}

interface MyInterface {
    String foo (String s,int x, int y);
}

class MyClass{
    public String foo2(MyInterface i,String s,int x, int y){
        return i.foo(s,x,y);
    }
}