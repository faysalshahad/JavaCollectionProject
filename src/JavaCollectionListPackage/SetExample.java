package JavaCollectionListPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

    public static void main (String args []) {
        List<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<String>();

        Set <Integer> obj = new HashSet<>();
        HashSet<Integer> obj1 = new HashSet<Integer>();

        obj.add(1);
        obj.add(2);
        // Value 2 will not be added because it is a duplicated value and set does not allow any duplication.
        obj.add(2);
        obj.add(3);

        System.out.println(obj);
        System.out.println(obj.contains(2));
        System.out.println(obj.contains(4));
        // Checking if there is no value being added to the set. If there is value then it will return false
        System.out.println(obj.isEmpty());
        //System.out.println(obj.equals(2));

        if (!obj.isEmpty()){
            for (Integer integer : obj) {
                System.out.print(integer + ", ");
            }
        }

        obj.removeAll(obj);

        
        obj1.add(4);
        obj1.add(5);
        // Value 5 will not be added because it is a duplicated value and set does not allow any duplication.
        obj1.add(5);
        obj1.add(6);
        obj1.add(7);
        System.out.println(obj1);
        obj1.removeAll(obj1);

        // for(int i = 0; i < obj1.size(); i++){
        //     System.out.println(obj1.get(i));
        // }

        boolean isTrueOrFalse = obj.equals(obj1);
        System.out.println("The result is true or False = " + isTrueOrFalse);
    }



}
