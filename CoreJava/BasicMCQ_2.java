package CoreJava;

public class BasicMCQ_2 {
    public static void main(String[] args) {

//-----------------------------------------------------------------------------------
        Gold gold = new Gold();
        gold.makeNoise();
//-----------------------------------------------------------------------------------
        String str = "Poo arasan!";
        String str1 = "Poo" + " " + "arasan" + "!";
        //TODO :Que:1 -> How many entries created in String Pool
        System.out.println(str == str1);
    }
}

abstract class Animal {
    public abstract void makeNoise();
}

class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("CoreJava.Dog");
    }
}

class Gold extends Dog {
    public void makeNoise() {
        super.makeNoise();
        System.out.println("gold");
    }
}