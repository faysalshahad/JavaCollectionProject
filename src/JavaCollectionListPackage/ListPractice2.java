package JavaCollectionListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice2 {

    public static void main (String args []) {

        List<String> list = new ArrayList<>();
 
        List<String> list2 = Arrays.asList("Ant", "Frog", "Beatle");

        List<String> list3 = Arrays.asList("Lion", "Jaguar", "Tiger");

        list.add("Benjamin");
        list.add("Clark");
        list.add("Julia");
        list.add(0,"Samantha");

        list.addAll(list2);

        for (String string : list) {

            System.out.print(string + ", ");
            
        }

        System.out.println("");
        System.out.println("");

        list.addAll(1,list3);

        for (String string : list) {

            System.out.print(string + ", ");
            
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Contains Value 1= " + list.contains("Tiger"));

        System.out.println("Contains Value 2= " + list.contains("Rhinoceros"));

        System.out.println("Get value from 5th index = " + list.get(5));

        System.out.println("Get index number of = "+ list.indexOf("Lion"));

        list.add("Turbulence");

        System.out.println("");
        System.out.println("");

        System.out.println(list);

        System.out.println("Removing Turbulence from list = " + list.remove("Turbulence"));

        System.out.println("New List is below = ");

        System.out.println(list);






    }
 
}
