package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BasicMCQ_1 {
    public static void main(String[] args) {
//-----------------------------------------------------------------------------------
        Integer i= new Integer(128);
        /*
        Logic: byte holds -128 to 127. If the value goes beyond 127 it will became negative by default and
        it will continue in circular order
         */
        byte x = i.byteValue();
        System.out.println(x);
//-----------------------------------------------------------------------------------
        double a=3.000001;
        int b=(int) Math.ceil(a);
        System.out.println(b);
//-----------------------------------------------------------------------------------
        ArrayList<String> x1 = new ArrayList<>();
        x1.add("CoreJava.A");
        x1.add("b");
        x1.add("c");
        x1.add(1,"CoreJava.X");
        System.out.println(x1);
//-----------------------------------------------------------------------------------
        LinkedList<Integer> list=new LinkedList<>();
        list.add(new Integer(2));
        list.add(new Integer(8));
        list.add(new Integer(5));
        list.add(new Integer(1));
        Iterator<Integer> iterator=list.iterator();
        Collections.reverse(list);
        Collections.sort(list);
        while (iterator.hasNext())
        {
            System.out.println(iterator.next()+" ");
        }
//-----------------------------------------------------------------------------------
    }
}