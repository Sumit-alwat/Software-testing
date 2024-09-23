package Projects;

import java.util.Scanner;

public class Pr006 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of terms in the Fibonacci series: ");
	        int terms = scanner.nextInt();
	        
	        if (terms <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            System.out.print("Fibonacci Series: ");
	            printFibonacci(terms);
	        }
	        
	        scanner.close();
	    }

	    public static void printFibonacci(int terms) {
	        int first = 0, second = 1;
	        
	        for (int i = 1; i <= terms; i++) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	        }
	    }
	}

