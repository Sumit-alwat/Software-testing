package Projects;
//W.A.J.P to find the second largest element in an array
import java.util.Scanner;

public class Pr027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int secondLargest = findSecondLargest(array);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("The array does not have enough distinct elements to determine the second largest.");
        }

        sc.close();
    }

    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}