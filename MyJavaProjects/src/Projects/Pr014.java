package Projects;

import java.util.Scanner;

//W.A.J.P to find the index of an array element
public class Pr014 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to find the index of:");
        int target = sc.nextInt();

        int index = -1;

        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                index = i;
                break; 
            }
        }

        if (index != -1) {
            System.out.println("The element " + target + " is found at index: " + index);
        } else {
            System.out.println("The element " + target + " is not found in the array.");
            sc.close();
        }
    }
}