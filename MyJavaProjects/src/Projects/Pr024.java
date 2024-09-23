package Projects;
//W.A.J.P to remove the third element from a array list
import java.util.ArrayList;

	public class Pr024 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Berry");

        System.out.println("Original ArrayList: " + fruits);

        if (fruits.size() >= 3) {
            fruits.remove(2);
            System.out.println("\nArrayList after removing the third element: " + fruits);
        } else {
            System.out.println("\nThe ArrayList does not have enough elements to remove the third one.");
        }
    }
}