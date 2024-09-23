package Projects;
//W.A.J.P to Copy one array into another
import java.util.Arrays;

public class Pr025 {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray1 = new int[originalArray.length]; 
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray1[i] = originalArray[i]; 
        }

        System.out.println("Copied array using loop: " + Arrays.toString(copiedArray1));

       
    }
}