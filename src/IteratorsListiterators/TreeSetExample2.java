package IteratorsListiterators;

import java.util.TreeSet;

public class TreeSetExample2 {

    public static void main (String args []) {
        TreeSet<String> obj = new TreeSet();

        try {
            
        obj.add("Cabbage");
        obj.add("Chili");
        obj.add(null);
        obj.add("Potato");
        obj.add("Tomato");
        obj.add("Carrot");

        if (obj.contains(null)) {
            obj.remove(null);
        }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Null Pointer Exception");
        }


        

        System.out.println("TreeSet is printing values but it never accepts null value = " + obj + ", ");

    }

}
