//import java.util.*;

public class Main {
    // private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        MyList list = new MyLinkedList();

        // Agregar algunas cadenas a la lista
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        /*
         * apple
         * banana
         * cherry
         */

        // Imprimir el tamaño de la lista
        System.out.println("Size: " + list.size());

        // Imprimir las cadenas en la lista
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Verificar si la lista contiene una cadena
        System.out.println("Contains 'banana': " + list.contains("banana"));

        // Obtener el índice de una cadena
        System.out.println("Index of 'cherry': " + list.index("cherry"));

        // Eliminar una cadena por índice
        list.remove(1);

        /*
         * apple
         * cherry
         */

        // Imprimir el tamaño de la lista
        System.out.println("Size: " + list.size());

        // Imprimir las cadenas en la lista
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Eliminar una cadena por valor
        list.remove("apple");

        /*
         * cherry
         */

        // Imprimir el tamaño de la lista
        System.out.println("Size: " + list.size());

        // Imprimir las cadenas en la lista
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}