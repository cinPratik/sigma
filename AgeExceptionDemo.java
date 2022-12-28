/**
Name:
Class:			Batch:
Experiment No: 06
Program on: Nested Try
*/

import java.util.Scanner;

class AgeException extends Exception {
 
 public AgeException(String str) {
  System.out.println(str);
 }
}
public class AgeExceptionDemo {

 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Please enter your age: ");
  int age = s.nextInt();
  
  try {
   if(age < 18) 
    throw new AgeException("Invalid age");
   else
    System.out.println("Valid age");
  }
  catch (AgeException a) {
   System.out.println(a);
  }
 }
}