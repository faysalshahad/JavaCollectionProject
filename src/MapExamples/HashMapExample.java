package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main (String args []) {
        HashMap<String, Integer> obj = new HashMap();

        obj.put("Charles", 40);
        obj.put("Abigail", 20);
        obj.put("Ethan", 10);
        obj.put("Sinthia", 50);
        obj.put("Thomas", 60);
        obj.put("Olivia", 30);
        obj.put("Henry", 30);
        obj.put("Amelia", 70);
        obj.put("Henry", 80); // Overriding the previous value
        obj.put(null, null);
        obj.put(null, null); // duplicate null value pair will not be accepted or inserted

        System.out.println(obj);

        obj.remove("Henry"); // removing henry value pair

        System.out.println("After removing Henry the map will look like following :");
        System.out.println(obj); // henry has been removed

        obj.hashCode();
        //System.out.println(obj);

        System.out.println("Retriving value of Abigail = " + obj.get("Abigail"));

        obj.replace("Thomas", 90);

        System.out.println("After updating value of Thomas the map will like following :");
        System.out.println(obj);

        for(Map.Entry<String, Integer> data:obj.entrySet()){ //to access the value from a map we are using entrySet method
            System.out.print(data.getKey() + " " + data.getValue() + ", ");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Inserting All values from obj to obj2.");

        HashMap<String, Integer> obj2 = new HashMap<>();

        obj2.putAll(obj);

        System.out.println(obj2);

        obj2.put("Harper", 47);

        System.out.println(obj2);

        obj2.clear();

        System.out.println("Values after using the clear() method. All the values will be deleted.\n"+ obj2);


    }
}
