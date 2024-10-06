package IteratorsListiterators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortExample {

    public static void main (String args []) {

        List <Integer> obj = Arrays.asList(5,8,3,4,2,0,1,7,9,6);

        List <String> obj1 = Arrays.asList("abfsdffsd", "axfasfa", "asasfew");

        List <Character> obj2 = Arrays.asList('a', 'd', 'x','h' ,'q','k', 'b', 'c');

        System.out.println(obj);

        Collections.sort(obj);

        System.out.println(obj);

        Collections.reverse(obj);

        System.out.println(obj);

        Collections.reverse(obj);

        System.out.println(obj);

        Collections.sort(obj, Collections.reverseOrder());

        System.out.println(obj);

        System.out.println("");

        System.out.println(obj1);

        Collections.sort(obj1);

        System.out.println(obj1);

        System.out.println("");

        System.out.println(obj2);

        Collections.sort(obj2);

        System.out.println(obj2);



    }

}
