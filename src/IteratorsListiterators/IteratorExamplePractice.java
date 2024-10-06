package IteratorsListiterators;
import java.util.HashSet;
import java.util.Iterator;


public class IteratorExamplePractice {

    public static void main (String args []) {

    HashSet <String> hashObj = new HashSet();

    hashObj.add("Cauliflower");
    hashObj.add("Brocoli");
    hashObj.add("Spinach");
    hashObj.add("Pumpkin");
    hashObj.add("Okra");

    System.out.println(hashObj);

    System.out.println("");

    System.out.println("Cucumber is in the list or not?");
   // System.out.println(hashObj.contains("Cucumber"));

   boolean trfa1 = hashObj.contains("Cucumber");
    if (trfa1) {
        System.out.println("Hurrah. Cucumber is in the List.");
    } else {
        System.out.println("Alas. Cucumber is not in the List.");
    }

    System.out.println("");

    System.out.println("Beans is in the list or not?");

    if (hashObj.contains("Okra")) {
        System.out.println("Hurrah. Okra is in the List.");
    } else {
        System.out.println("Alas. Okra is not in the List.");
    }


   // System.out.println(hashObj.contains("Beans"));

   System.out.println("");

   System.out.println("Printing the list by suing Iterator.");

    Iterator <String> iter = hashObj.iterator();

  while (iter.hasNext()) {

    System.out.print(iter.next());

    if (iter.hasNext()) {
        System.out.print(", ");
        
    }
    
  }

}
}
