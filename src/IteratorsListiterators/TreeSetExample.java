package IteratorsListiterators;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main (String args []) {

        TreeSet <Integer> obj = new TreeSet();

        obj.add (15);
        obj.add (39);
        obj.add (68);
        obj.add (97);
        obj.add (42);
        obj.add (51);
        obj.add (79);
        obj.add (87);
        obj.add (9);
        obj.add (27);
        obj.add(59);

        System.out.println("TreeSet Object = " + obj);

        obj.remove(59);

        System.out.println("After Removing 59 = " + obj);

        System.out.println("If the value contains 15 = " + obj.contains(15) );

        System.out.println("Printing the First Element = " + obj.first());

        System.out.println("Printing the last element = " + obj.last());

        System.out.println("Higher than 87 = " + obj.higher(87));

        System.out.println("Lower than 27 = " + obj.lower(27));

        Iterator <Integer> b = obj.iterator();

        System.out.println("=====================");
        System.out.println("Printing TreeSet by using while loop");

        while (b.hasNext()){
            System.out.println(b.next());
        }

        
        System.out.println("=====================");
        System.out.println("Printing TreeSet by using For each loop");

        for (Integer a: obj) {
            System.out.println(a);
        }

        
    }

}
