package Projects;

import java.util.Scanner;

//W.A.J.P to Compare Two String
public class Pr016 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the first string:");
	        String firstString = sc.nextLine();

	        System.out.println("Enter the second string:");
	        String secondString = sc.nextLine();

	        if (firstString.equals(secondString)) {
	            System.out.println("The strings are equal.");
	        } else {
	            System.out.println("The strings are not equal.");
	        }

	        // Compare the two strings lexicographically
	        int result = firstString.compareTo(secondString);
	        if (result < 0) {
	            System.out.println("The first string is lexicographically less than the second string.");
	        } else if (result > 0) {
	            System.out.println("The first string is lexicographically greater than the second string.");
	        } else {
	            System.out.println("The strings are lexicographically equal.");
	            sc.close();
	        }
	    }
}