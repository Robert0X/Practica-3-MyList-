//import java.util.*;

public class Main {
    // private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        MyList<String> linkedList = new MyLinkedList<>();

        // Agregar algunas cadenas a la lista
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");

        /*
         * apple
         * banana
         * cherry
         */

        // Imprimir el tamaño de la lista
        System.out.println("Size: " + linkedList.size());

        // Imprimir las cadenas en la lista
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // Verificar si la lista contiene una cadena
        System.out.println("Contains 'banana': " + linkedList.contains("banana"));

        // Obtener el índice de una cadena
        System.out.println("Index of 'cherry': " + linkedList.indexOf("cherry"));

        // Eliminar una cadena por índice
        linkedList.remove(1);

        /*
         * apple
         * cherry
         */

        // Imprimir el tamaño de la lista
        System.out.println("Size: " + linkedList.size());

        // Imprimir las cadenas en la lista
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // Eliminar una cadena por valor
        linkedList.remove("apple");

        /*
         * cherry
         */

        // Imprimir el tamaño de la lista
        System.out.println("Size: " + linkedList.size());

        // Imprimir las cadenas en la lista
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}

/*
 * //import java.util.*;
 * 
 * public class Main {
 * // private static Scanner cin = new Scanner(System.in);
 * public static void main(String[] args) {
 * 
 * System.out.println("Ingrese el tamaño de la lista:");
 * int size = scanner.nextInt();
 * 
 * MyList<Integer> list = new MyArrayList<>();
 * for (int i = 0; i < size; i++) {
 * System.out.println("Ingrese un entero:");
 * int num = scanner.nextInt();
 * list.add(num);
 * }
 * 
 * System.out.println("Tamaño de la lista: " + list.size());
 * for (int i = 0; i < list.size(); i++) {
 * System.out.println("Elemento " + i + ": " + list.get(i));
 * }
 * 
 * System.out.println("¿Contiene 42? " + list.contains(42));
 * 
 * System.out.println("Eliminando 10...");
 * list.remove(10);
 * 
 * System.out.println("Tamaño de la lista: " + list.size());
 * for (int i = 0; i < list.size(); i++) {
 * System.out.println("Elemento " + i + ": " + list.get(i));
 * }
 * 
 * cin.close();
 * }
 * }
 */