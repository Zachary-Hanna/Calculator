/*
 Zachary Hanna
 January 25, 2017
 Description:  Inside of this program, we allow the user to enter two numbers.
               With the two numbers this program will add, subtract, mulitiply,
               and divide the numbers together, finding the result, and 
               displaying the results.
*/ 

import java.util.Scanner; // library that allows for keyboard usage

public class Calculators // the main body of the program
{
  public static void main(String[] args) 
  {
    
    float number1, number2; // declared variables
    
    Scanner input = new Scanner(System.in); // allows keyboard inputs from the user
    
    System.out.println("Enter your first number:"); // asking for first number
    number1 = input.nextFloat(); // for receiving first number
    
    System.out.println("Enter your second number:"); // asking for second number
    number2 = input.nextFloat(); // for recieving second number
    
    System.out.println(number1 + " + " + number2 + " = " + (number1+number2) );
    System.out.println(number1 + " - " + number2 + " = " + (number1-number2) );
    System.out.println(number1 + " x " + number2 + " = " + (number1*number2) );
    System.out.println(number1 + " Ö " + number2 + " = " + (number1/number2) );
    
    // the four lines of code above display the full problems and their answers
  }
}