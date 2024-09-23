package Projects;

import java.util.Scanner;
public class Pr005 {
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        
	        int number = scanner.nextInt();

	        if (isArmstrongNumber(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	        scanner.close();
	    }

	    public static boolean isArmstrongNumber(int num) {
	        int originalNum = num;
	        int sum = 0;
	        int numDigits = String.valueOf(num).length();

	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, numDigits);
	            num /= 10;
	        }

	        return sum == originalNum;
	    }
	}
