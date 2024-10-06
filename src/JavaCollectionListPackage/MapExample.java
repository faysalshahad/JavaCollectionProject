package JavaCollectionListPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

    public static void main (String args []) {

        Map <String, Integer> obj = new HashMap<>();

        Map <String, Integer> obj3 = new HashMap<>();

        HashMap<String, Integer> obj1 = new HashMap<>();

        LinkedHashMap<Integer, String> obj2 = new LinkedHashMap<>();

        obj.put("Apple", 20);
        //Duplicated Key and its value will not be printed. Here apple is the key in Map. 
        obj.put("Apple", 30);
        obj.put("Orange", 40);

        System.out.println(obj.get("Apple"));

        System.out.println(obj);

        for(Map.Entry<String, Integer> data: obj.entrySet()){
            System.out.println(data.getKey() + " " + data.getValue());
        }

        for (String string2 : obj.keySet()) {
            System.out.println("Key " + string2 + " " + "value " + obj.get(string2));
            
        }

        for (String string1 : obj.keySet()) {
            System.out.println(string1);
            
        }

        for (Integer integer2 : obj.values()) {
            System.out.println(integer2);
        }
       
    }

}
