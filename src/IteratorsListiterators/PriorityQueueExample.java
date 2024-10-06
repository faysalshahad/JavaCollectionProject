package IteratorsListiterators;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueExample {

    public static void main (String args []) {
        PriorityQueue<Integer> obj = new PriorityQueue();

        obj.add(91);
        obj.add(56);
        obj.add(89);
        obj.add(64);
        obj.add(72);

        System.out.println(obj);
        System.out.println("Getting and removing the First value = ");
        System.out.println(obj.poll());
        System.out.println(obj);
        System.out.println("Getting the First value = ");
        System.out.println(obj.peek());
        System.out.println(obj);
        System.out.println("Getting and removing the First value = ");
        System.out.println(obj.remove());
        System.out.println(obj);
        System.out.println("Adding a new value = ");
        System.out.println(obj.offer(47));
        System.out.println(obj);


    }

}
