import java.util.*;

public class Main {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        // Add some strings to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        /*
         * apple
         * banana
         * cherry
         */

        // Print the size of the list
        System.out.println("Size: " + list.size());

        // Print the strings in the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Check if the list contains a string
        System.out.println("Contains 'banana': " + list.contains("banana"));

        // Get the index of a string
        System.out.println("Index of 'cherry': " + list.index("cherry"));

        // Remove a string by index
        list.remove(1);

        /*
         * apple | apple
         * banana | cherry
         * cherry |
         */

        // Print the size of the list
        System.out.println("Size: " + list.size());

        // Print the strings in the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Remove a string by value
        list.remove("apple");

        /*
         * apple | cherry
         * cherry |
         * 
         */

        // Print the size of the list
        System.out.println("Size: " + list.size());

        // Print the strings in the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        cin.close();
    }

}