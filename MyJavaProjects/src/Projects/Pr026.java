
package Projects;
//W.A.J.P to reverse an array of integer values

import java.util.Arrays;
public class Pr026 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(array));
        reverseArrayUsingLoop(array);
    }

    public static void reverseArrayUsingLoop(Integer[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i]; 
            array[i] = array[length - i - 1]; 
            array[length - i - 1] = temp;
        }
        System.out.println("Reversed Array using loop: " + Arrays.toString(array));
    }
}
