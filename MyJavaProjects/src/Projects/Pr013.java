
package Projects;

import java.util.Scanner;

//W.A.J.P to calculate the average value of array elements
public class Pr013 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number of elements in the array:");
	        int n = sc.nextInt();

	        int[] numbers = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        int sum = 0;

	        for (int number : numbers) {
	            sum += number;
	        }

	        double average = (double) sum / n;

	        System.out.println("The average of the array values is: " + average);
	        sc.close();
	        }
}
