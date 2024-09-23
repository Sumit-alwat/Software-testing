package Projects;
//W.A.J.P to check given number is Prime or not?

import java.util.Scanner;

public class Pr004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Input from the user.
		System.out.println("enter a positive integer number");
		int prnum = scanner.nextInt();
		
		//For any negative number.
		if(prnum<0) {
			System.out.println("Try again with a positive integer number please.");
		}
		else
		{
		   if(isPrime(prnum)) {
			   System.out.println("The given number is a prime number");
		   }
		   else {
			   System.out.println("The given number is not a prime number");
		   }
		}
	}

	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }
}