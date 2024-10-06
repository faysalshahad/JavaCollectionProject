package JavaCollectionListPackage;

import java.util.Stack;
import java.util.Vector;

public class VectorExample2 {

    public static void main (String args []) {
        Stack<Integer> obj = new Stack <> ();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);

        while (!obj.isEmpty()){
            System.out.println("Printing the Vector = " + obj.pop());
        }

        
    }
}
