package IteratorsListiterators;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main (String agrs []) {

        HashSet<String> obj = new HashSet();

        obj.add("Apple");
        obj.add("Orange");
        obj.add("Pineapple");
        obj.add("Mango");
        obj.add("Jackfruit");

        System.out.println(obj);

        System.out.println("==========================");

        obj.remove("Mango");

        System.out.println(obj);

        System.out.println("Set Size = " + obj.size());

        System.out.println("Contains Method: " + obj.contains("Lemon"));

       // obj.clear();;

       // System.out.println("Data is being cleared. " + obj);

       // System.out.println("Using isEmpty Method " + obj.isEmpty());

       System.out.println("==========================");

       System.out.println("Using While Loop");

        Iterator<String> it = obj.iterator();

        while (it.hasNext()) {
            
            System.out.println(it.next());
        }

        // System.out.println("==========================");

        // System.out.println("Using do while Loop");

        // do {
            
        //     System.out.println(it.next());
        // }  while (it.hasNext());

    

        System.out.println("==========================");

        System.out.println("Using for Loop");

        for (String st: obj) {
            System.out.println(st);
        }

         obj.clear();;

       System.out.println("Data is being cleared. " + obj);

       System.out.println("Using isEmpty Method " + obj.isEmpty());
    
    
        
    }

}
