package MapExamples;

import java.util.Hashtable;

public class HashTableExample {

    public static void main (String args []) {

        Hashtable<String, Integer> obj = new Hashtable<>();

        // Hashtable will never accept any null value. Otherwise it will show null pointer exception error.

        //obj.put(null, null);

        obj.put("Sarah", 17);

        System.out.println(obj);

        

    }

}
