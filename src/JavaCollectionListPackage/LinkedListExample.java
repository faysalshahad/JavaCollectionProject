package JavaCollectionListPackage;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList <Integer> obj = new LinkedList<>();
        obj.add(1);
        obj.add(2);
        obj.addFirst(5);
        obj.addLast(3);
        obj.add(6);
        obj.add(4);
        System.out.println(obj);

        for (Integer integer : obj) {
            System.out.print(integer + ", ");
        }
        
    }

}
