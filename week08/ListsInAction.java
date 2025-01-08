package week08;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class ListsInAction {
    public static void main(String[] args) {
        // Integerlist
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        
        // Printing with ToString method:
        System.out.println("Output with ToString method: " + list.toString());

        // Printing with for statement:
        System.out.print("Output with for statement: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }

        System.out.println();

        // Printing with enhanced for statement:
        System.out.print("Output with enhanced for statement: ");
        for (Integer number : list) {
            System.out.print(number + ", ");
        }

        System.out.println();

        // Printing with iterator
        System.out.print("Output with iterator: ");
        Iterator<Integer> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println();

        // ShoppingList
        List<String> ShoppingList = new ArrayList<>();
        ShoppingList.add("Coffee");
        ShoppingList.add("Tea");
        ShoppingList.add("Bread");
        ShoppingList.add("Butter");
        ShoppingList.add("Egg");
        ShoppingList.remove("Bread");
        ShoppingList.remove(2);

        // Printing with tostring method:
        System.out.print("Output with toString method: " + ShoppingList.toString());

        System.out.println();
        
        // Printing with for statement
        System.out.print("Output with for statement: ");
        for (int i = 0; i < ShoppingList.size(); i++) {
            System.out.print(ShoppingList.get(i) + ", ");
        }

        System.out.println();

        // Printing with enhanced for statement
        System.out.print("Output with enhanced for statement: ");
        for (String item : ShoppingList) {
            System.out.print(item + ", ");
        }

        System.out.println();

        // Printing with iterator
        System.out.print("Output with iterator: ");
        Iterator<String> iterator2 = ShoppingList.iterator();

        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + ", ");
        } 

        System.out.println();
        
        // New Shopping list
        List<String> newShoppingList = new ArrayList<>();
        newShoppingList.add("Coffee");
        newShoppingList.add("Tea");
        newShoppingList.add("Bread");
        newShoppingList.add("Butter");
        newShoppingList.add("Egg");
        newShoppingList.add("Apple");
        newShoppingList.add("Kiwi");

        System.out.println("New Shopping list items: " +  newShoppingList.toString());

        String searchItem = "Tea";

        // Checking if item exists or not
        if (newShoppingList.contains(searchItem)) {
            System.out.println(searchItem + " " + "exists in list");
        }
        else {
            System.out.println(searchItem + " " + "doesn't exist in list");
        }

        // LinkedList
        LinkedList<String> newLinkedList  = new LinkedList<String>();
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
        System.out.println("List with removing first item: " + newLinkedList.toString());

        newLinkedList.removeLast();
        System.out.println("List with removing first and last items: " + newLinkedList.toString());
    }
}
