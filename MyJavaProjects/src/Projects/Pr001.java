package Projects;

import java.util.Scanner;

public class Pr001 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		// Prompt user for input
		        System.out.print("Enter the 1st number: ");
		        int num1 = scanner.nextInt();
		        
		        System.out.print("Enter the 2nd number: ");
		        int num2 = scanner.nextInt();
		        
		        System.out.print("Enter the 3rd number: ");
		        int num3 = scanner.nextInt();
		        
	    // for finding  the greatest number
		        int greatest;
		        if (num1 >= num2 && num1 >= num3) {
		            greatest = num1;
		        } else if (num2 >= num1 && num2 >= num3) {
		            greatest = num2;
		        } else {
		        	greatest = num3;
		        }

		// Print the greatest number
		        System.out.println("The greatest number is: " + greatest);

	    //for all the same number
	    
		        if(num1==num2 && num1==num3) {
		        	System.out.println("all the number are same"); 	
		        }
	            
	    // Close the scanner
		        scanner.close();
	}
}