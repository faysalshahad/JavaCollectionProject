package MapExamples;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main (String args []) {

        TreeMap <Integer, String> obj = new TreeMap<>();

        obj.put(1, "A");
        obj.put(8, "C");
        obj.put(6, "R");
        obj.put(3, "H");
        obj.put(7, "L");

        System.out.println(obj);

        TreeMap <String, Integer> obj1 = new TreeMap<>();

        obj1.put("C", 1);
        obj1.put("A", 3);
        obj1.put("G", 5);
        obj1.put("I", 7);
        obj1.put("N", 8);

        System.out.println(obj1);

    }

}
