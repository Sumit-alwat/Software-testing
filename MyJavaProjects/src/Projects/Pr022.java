
package Projects;
//W.A.J.P to iterate through all elements in an array list
import java.util.ArrayList;
import java.util.Iterator;

public class Pr022 {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Method 1: Using a simple for loop
        System.out.println("Iterating using a simple for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Method 2: Using an enhanced for loop (for-each loop)
        System.out.println("\nIterating using an enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Method 3: Using an Iterator
        System.out.println("\nIterating using an Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Method 4: Using Java 8 Stream API with forEach
        System.out.println("\nIterating using Java 8 Stream API:");
        fruits.stream().forEach(System.out::println);

        // Method 5: Using Java 8 forEach method
        System.out.println("\nIterating using Java 8 forEach method:");
        fruits.forEach(System.out::println);
    }
}
