
package Projects;

import java.util.Scanner;

//W.A.J.P to concatenate a given string to the end of another string
public class Pr017 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the first string:");
	        String firstString = sc.nextLine();

	        System.out.println("Enter the second string:");
	        String secondString = sc.nextLine();

	        String concatenatedString = firstString + secondString;

	        System.out.println("The concatenated string is: " + concatenatedString);
	        sc.close();
	    }
}
