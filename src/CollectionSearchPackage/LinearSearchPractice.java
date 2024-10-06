package CollectionSearchPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearchPractice {

    public static void main (String args []) {

        List<Integer> dyarr = new ArrayList<>();
        int a, b, c;

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter 5 number = ");

        for (int i = 0 ; i < 5 ; i++){
            a = scn.nextInt();
            dyarr.add(a);
        }

        System.out.println("");

        //System.out.println("The value inside index 2 is = " + dyarr.get(2));

        System.out.println("Give the index number = " );

        c =scn.nextInt();

        c+= 1; // Adding plus 1 to match with the array length or array list size which is always (+1) than the index value 

        //c = dyarr.get(6);

        b = LinearSearchE(dyarr, c);

        if (b == -1) {
            System.out.println("No Value is found inside index " + (c-1));  // Deducting 1 to match with the index value which is always (-1) than the array length or array list size
            
        } else
        System.out.println("The value inside index " + c + " is = " + b);

        scn.close();
    }

    static int LinearSearchE (List<Integer> li, int targetValue) {

        if (li.size() >= targetValue) {            

        for (int i = 0; i < li.size(); i ++) {

            if (li.get(i) == targetValue) {

                return li.get(i);

                //System.out.println("Linear Search Result for index 2 is= " + li.get(2));
            }

        }
    } 
        return -1;

    };

}
