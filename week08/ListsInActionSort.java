package week08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListsInActionSort {
    public static void main(String[] args) {
        // Integerlist
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // Sorting with Collections.sort() method
        Collections.sort(list);
        System.out.println("Sorted list with Collections.sort(): " + list);

        // Sorting with List.sort()va 8+)
        list.sort(null); // Using natural ordering
        System.out.println("Sorted list with List.sort(): " + list);

        // Sorting with Comparator interface (anonymous class)
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // Reverse order
            }
        });
        System.out.println("Sorted list with Comparator: " + list);

        // ShoppingList
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Coffee");
        shoppingList.add("Tea");
        shoppingList.add("Bread");
        shoppingList.add("Butter");
        shoppingList.add("Egg");
        shoppingList.remove("Bread");
        shoppingList.remove(2);

        // Sorting with Collections.sort() method
        Collections.sort(shoppingList);
        System.out.println("Sorted shopping list with Collections.sort(): " + shoppingList);

        // Sorting with List.sort() method (Java 8+)
        shoppingList.sort(Comparator.naturalOrder()); // Using natural ordering
        System.out.println("Sorted shopping list with List.sort(): " + shoppingList);

        // Sorting with Comparator interface (anonymous class)
        shoppingList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareToIgnoreCase(o1); // Reverse order ignoring case
            }
        });
        System.out.println("Sorted shopping list with Comparator: " + shoppingList);

        // New Shopping list
        List<String> newShoppingList = new ArrayList<>();
        newShoppingList.add("Coffee");
        newShoppingList.add("Tea");
        newShoppingList.add("Bread");
        newShoppingList.add("Butter");
        newShoppingList.add("Egg");
        newShoppingList.add("Apple");
        newShoppingList.add("Kiwi");

        // Sorting with Collections.sort() method
        Collections.sort(newShoppingList);
        System.out.println("Sorted new shopping list with Collections.sort(): " + newShoppingList);

        // Sorting with List.sort() method (Java 8+)
        newShoppingList.sort(Comparator.naturalOrder()); // Using natural ordering
        System.out.println("Sorted new shopping list with List.sort(): " + newShoppingList);

        // Sorting with Comparator interface (anonymous class)
        newShoppingList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Reverse order
            }
        });
        System.out.println("Sorted new shopping list with Comparator: " + newShoppingList);

        // LinkedList
        LinkedList<String> newLinkedList = new LinkedList<String>();
        newLinkedList.add("Tomato");
        newLinkedList.add("Potato");
        newLinkedList.add("Coffee");
        newLinkedList.add("Tea");
        newLinkedList.add("Bread");
        newLinkedList.add("Butter");
        newLinkedList.add("Egg");
        newLinkedList.add("Apple");
        newLinkedList.add("Kiwi");

        newLinkedList.removeFirst();
        System.out.println("List with removing first item: " + newLinkedList);

        newLinkedList.removeLast();
        System.out.println("List with removing first and last items: " + newLinkedList);
    }
}
