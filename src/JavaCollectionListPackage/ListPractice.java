package JavaCollectionListPackage;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {


    public static void main (String args []) {

        List<Integer> num1 = new ArrayList<>();

        for (int i = 1 ; i < 100 ; i+=12) {
            num1.add(i);
        }

        System.out.println(num1);

        num1.set(4, 63);

        System.out.println("List Total size is = " + num1.size() + " and the 2nd index value is = " + num1.get(2));



        System.out.println("Here is all the vlaue = ");

        for (Integer integer : num1) {
            System.out.println(integer);
        }

        


    }
}
