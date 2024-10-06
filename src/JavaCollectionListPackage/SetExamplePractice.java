package JavaCollectionListPackage;

import java.util.HashSet;
import java.util.Set;

public class SetExamplePractice {

    public static void main (String args []) {

        Set<Integer> s1 = new HashSet<>();

        HashSet<Integer> s2 = new HashSet<Integer>();

        s1.add(1);
        s1.add(2);
        s1.add(3);

        s2.add(4);
        s2.add(5);
        s2.add(6);

        System.out.println("First Set Values =" + s1);

        System.out.println("Second Set Values =" + s2);

        for (Integer integer : s1) {

            System.out.println("First Set Values by using for-each loop =" + integer);
            
        }

        for (Integer integer : s2) {

            System.out.println("Second Set Values by using for-each loop =" + integer);
            
        }

        boolean isTrueOrFalse = s1.equals(s2);

        System.out.println("Comparison Result = " + isTrueOrFalse);
        
    }

}
