package Projects;
//W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. 
//Call the methods 'message' by creating an object for each subclass.

import java.util.Scanner;

abstract class Parent {
 abstract void message();
}

class FirstSubclass extends Parent {
 @Override
 void message() {
     System.out.println("This is first subclass");
 }
}

class SecondSubclass extends Parent {
 @Override
 void message() {
     System.out.println("This is second subclass");
 }
}

public class Pr028 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter 1 for the first subclass or 2 for the second subclass:");
     int choice = sc.nextInt();

     Parent selected;
     if (choice == 1) {
         selected = new FirstSubclass();
     } else if (choice == 2) {
         selected = new SecondSubclass();
     } else {
         System.out.println("Invalid choice!");
         sc.close(); 
         return; 
     }

     selected.message();

     sc.close(); 
 }
}