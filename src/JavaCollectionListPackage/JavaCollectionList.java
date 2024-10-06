package JavaCollectionListPackage;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionList {


    public static void main (String args []) {

        ArrayList <String> li = new ArrayList<String>();

        List<String> li2 = new ArrayList<>();

        ArrayList <Integer> li1 = new ArrayList<Integer>();

        li2.add("Sinthia");
        li2.add("Johnson");
        li2.add("Maria");
        li2.add("David");
        li2.add(4,"Jonathon");

        System.out.println(li2);
        System.out.println(li2.size());
        System.out.println(li2.get(2));

        for (String lif : li2) {
            System.out.println(lif);
            
        }

        li.add("Julia");
        li.add("Charley");
        li.add("Judith");
        li.add("Sheen");
        li.add(2,"Ryan");

        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.get(3));

        for (String lif2 : li) {
            System.out.println(lif2);
            
        }
    }
}
