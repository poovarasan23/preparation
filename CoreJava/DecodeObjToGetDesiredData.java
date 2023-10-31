package CoreJava;

import java.util.HashMap;
import java.util.Map;
/*
Recursion to get desired data from object
 */
public class DecodeObjToGetDesiredData {
    public static void main(String[] args) {
        Map<String,Object> map1=new HashMap<>();
        Map<String,Object> map2=new HashMap<>();
        Map<String,Object> map3=new HashMap<>();

        map1.put("CoreJava.A","a");
        map1.put("CoreJava.B",map2);
        map1.put("C","c");

        map2.put("D","d");
        map2.put("CoreJava.B",map3);
        map2.put("E","e");

        map3.put("F","f");
        map3.put("CoreJava.B","b");
        map3.put("G","g");

        System.out.println(test("CoreJava.B",map1));
    }

    public static String test(String k, Map<String,Object> m){

        Object obj = m.get(k);
        return (obj instanceof Map) ? test(k, (Map<String,Object>) obj) : (String) m.get(k) ;
    }

}
