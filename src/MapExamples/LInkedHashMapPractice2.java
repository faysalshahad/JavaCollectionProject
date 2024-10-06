package MapExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LInkedHashMapPractice2 {

    public static void main (String args []) {
        LinkedHashMap<Integer, Character> obj = new LinkedHashMap<>();

        obj.put(1, 'a');
        obj.put(8, 'u');
        obj.put(4, 'l');
        obj.put(7, 'r');
        obj.put(5, 'j');

        System.out.println("The data will be displayed serially as per user entry.");

        System.out.println(obj);

        System.out.println("");

        HashMap<Integer, Character> obj1 = new HashMap<>();

        obj1.put(1, 'a');
        obj1.put(8, 'u');
        obj1.put(4, 'l');
        obj1.put(7, 'r');
        obj1.put(5, 'j');

        System.out.println("The data will be displayed in ascending order.");

        System.out.println(obj1);

        System.out.println("");
        System.out.println("Printing keys First Method = ");

        for(Map.Entry <Integer, Character> data: obj.entrySet()) {
            System.out.print(data.getKey() + ", ");
        }

        System.out.println("");
        System.out.println("Printing Values First Method = ");

        for(Map.Entry <Integer, Character> data: obj.entrySet()) {
            System.out.print(data.getValue() + ", ");
        }

        System.out.println("");
        System.out.println("Printing keys in Different Way = ");
        for (Integer data1 : obj.keySet()) {
            System.out.print(data1 + ", ");

        }

        System.out.println("");
        System.out.println("Printing values in Different Way = ");

        for (Character data2 : obj.values()) {
            System.out.print(data2 + ", ");

        }

    }

}
