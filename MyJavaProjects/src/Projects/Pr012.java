package Projects;

import java.util.Scanner;

//W.A.J.P to sum values of an array
public class Pr012 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();      
        }

       int sum = 0;

        for (int number : num) {
            sum += number;
        }

        System.out.println("The sum of the array values is: " + sum);
        sc.close();
    }
}