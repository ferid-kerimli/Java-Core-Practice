package week09;

import java.util.LinkedList;
import java.util.Collections;

public class SortedLinkedlist {
    public static void main(String[] args) {
        // i:
        LinkedList<Integer> list1 = new LinkedList<>();

        long StartTime1 = System.nanoTime();
        // Adding elements
        AddElementsInSortedOrder(list1, 15);
        AddElementsInSortedOrder(list1, 13);
        AddElementsInSortedOrder(list1, 19);
        AddElementsInSortedOrder(list1, 7);
        AddElementsInSortedOrder(list1, 23);

        long EndTime1 = System.nanoTime();
        long TimeElapsed1 = EndTime1 - StartTime1;

        System.out.println("List1 in sorted order: " + list1);
        System.out.println("Time elapsed: " + TimeElapsed1 + " nanoseconds");

        // ii:
        LinkedList<Integer> list2 = new LinkedList<>();

        long StartTime2 = System.nanoTime();
        // Adding elements
        list2.add(13);
        list2.add(17);
        list2.add(16);
        list2.add(32);
        list2.add(27);
        Collections.sort(list2);

        long EndTime2 = System.nanoTime();
        long TimeElapsed2 = EndTime2 - StartTime2;

        System.out.println("List2 in sorted order: " + list2);
        System.out.println("Time Elapsed: " + TimeElapsed2 + " nanoseconds");
    }

    private static void AddElementsInSortedOrder(LinkedList<Integer> list, int a) {
        int i = 0;
        while (i < list.size() && list.get(i) < a) {
            i++;
        }
        list.add(i, a);
    }
}
