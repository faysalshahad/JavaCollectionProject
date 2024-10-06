package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main (String args []) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(1,192);
        hm.put(2,623);
        hm.put(3,874);
        hm.put(4,479);
        hm.put(5,993);

        System.out.println("Full HashMap List = ");
        System.out.println(hm);
        System.out.println("");

        System.out.println("Getting Value  of Key 4 = " +hm.get(4));
        System.out.println("");

        System.out.println("Checking whether the key 5 is present in the list or not = ");
        System.out.println("Result = " + hm.containsKey(5));

        System.out.println("Checking whether the key 6 is present in the list or not = ");
        System.out.println("Result = " + hm.containsKey(6));

        System.out.println("");

        
        hm.replace(2, 764);
        System.out.println("Updated List after replcing value for 2 = " + hm);

        System.out.println("");

        for(Map.Entry<Integer, Integer> data: hm.entrySet()) {
            System.out.println(data.getKey() + " = " + data.getValue() + ", ");
        }
        



    } 

}
