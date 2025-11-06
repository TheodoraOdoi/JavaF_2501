package sess04_classes_objects_and_methods;

import java.util.Scanner;
/**
 * Java program to demonstrate the simplemath class methods.
 * 
 * @author todoi
 */
public class SimpleMathDemo
{
    static Scanner sc = new Scanner(System.in);
    // main method begins program execution
    public static void main(String[] args)
    {
        // prompt the user for the values to be used in the program
        System.out.println("Please enter the first number to be used in the" + "calculation ->");
        int firstNum = sc.nextInt();
        System.out.println("Please enter the second number to be used in the" + "calculation ->");
        int secondNum = sc.nextInt();
        
        // Declare ans instantiate a simpleMath object
        SimpleMath sm = new SimpleMath();
        
        // perform the various arithmetic operations
        long sum = sm.addNums(firstNum, secondNum);
        int difference = sm.subtractNums(firstNum, secondNum);
        long product = sm.multiplyNums(firstNum, secondNum);
        int quotient = sm.divideNums(firstNum, secondNum);
        float exponent = sm.getExponent(firstNum, secondNum);
        int remainder = sm.getModulus(firstNum, secondNum);
        
        // display the result of the arithmetic operations
        System.out.println("+".repeat(50));
        System.out.println("");
    }
}
