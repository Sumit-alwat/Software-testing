package Projects;

//W.A.J.P to find factorial for Given Number

import java.util.Scanner;

public class Pr003 {
	public static void main(String[] args) {
		Scanner getnum = new Scanner(System.in);
	
	//get a number from user.
		System.out.println("enter a positive integer number");
		int num = getnum.nextInt();
	
	//if entered number is negative.
		if(num<0) {
			System.out.println("entered number is negative hence cannot find the factorial for given number");
		}
	
		
	else {
			long f = 1;
			
			for( int i = 1; i <= num; i++) {
				f *= i;
			}
			
			System.out.println("The factorial for given number is : " +f);
		}
		getnum.close();
		
	}
}
