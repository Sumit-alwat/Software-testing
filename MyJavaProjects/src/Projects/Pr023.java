package Projects;
//W.A.J.P to update specific array element by given element
import java.util.ArrayList;
import java.util.Scanner;

public class Pr023 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Original ArrayList: " + fruits);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element you want to update: ");
        String elementToUpdate = sc.nextLine();

        System.out.print("Enter the new element: ");
        String newElement = sc.nextLine();

        if (fruits.contains(elementToUpdate)) {
            int index = fruits.indexOf(elementToUpdate);
            fruits.set(index, newElement); 
            System.out.println("\nArrayList after updating '" + elementToUpdate + "' with '" + newElement + "': " + fruits);
        } else {
            System.out.println("\nElement '" + elementToUpdate + "' not found in the ArrayList.");
        }

        sc.close();
    }
}