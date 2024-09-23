
package Projects;

import java.util.InputMismatchException;
import java.util.Scanner;

//W.A.J.P to demonstrate multiple catch blocks
public class Pr019 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter the first number: ");
	            int num1 = sc.nextInt();

	            System.out.print("Enter the second number: ");
	            int num2 = sc.nextInt();

	            int result = num1 / num2;

	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        } catch (InputMismatchException e) {
				System.out.println("Entered value should be numeric values");	    	
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Invalid number format.");
	        } catch (Exception e) {
	            System.out.println("Error: An unexpected error occurred.");
	        } finally {
	            sc.close();
	        }
	    }
}
