package Projects;

//W.A.J.P. to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount will deduct from account balance.
//Account balance is:2000 Enter withdraw amount:2500 Sorry, insufficient balance, you need more 500 Rs.To perform this transaction

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

public class Pr030 {
 private static double accountBalance = 2000.0; 

 public static void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > accountBalance) {
         double shortage = amount - accountBalance;
         throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + shortage + " Rs. to perform this transaction.");
     } else {
         accountBalance -= amount;
         System.out.println("Transaction successful! Your remaining balance is: " + accountBalance + " Rs.");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 

     System.out.print("Enter withdraw amount: ");
     double withdrawAmount = sc.nextDouble(); 

     try {
         withdraw(withdrawAmount);
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}