package Projects;

import java.util.Scanner;

//W.A.J.P to find the maximum and minimum value of an array
public class Pr015 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number of elements in the array:");
	        int n = sc.nextInt();

	        int[] numbers = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        int max = numbers[0];
	        int min = numbers[0];

	        for (int i = 1; i < n; i++) {
	            if (numbers[i] > max) {
	               max = numbers[i];
	            }
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	        }

	        System.out.println("The maximum value in the array is: " + max);
	        System.out.println("The minimum value in the array is: " + min);
	        sc.close();
	    }
}