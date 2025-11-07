package sess04_classes_objects_and_methods;

/**
 * Java program to demonstrate how to use overloaded methods.
 * 
 * @author Window
 */
public class MethodOverloadingDemo
{
    // main method begins program execution
    public static void main(String[] args)
    {
        // variables to be used in the program
        int firstNum = 3, secondNum = 5, thirdNum = 7, fourthNum = 8;
        byte firstByte = 4;
        long answer;
        
        MethodOverloading ml = new MethodOverloading();
        // add two integers and display their sum
        answer = ml.addNums(firstNum, secondNum);
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + answer);
        
        // add three integers and display their sum
        answer = ml.addNums(firstNum, secondNum, thirdNum);
        System.out.println("The sum of " + firstNum + "," + secondNum + " and " + thirdNum + " is " + answer);
        
        // add a byte and an integer and display their sum
        answer = ml.addNums(firstByte, firstNum);
        System.out.println("The sum of " + firstByte + " and " + firstNum + " " + " is " + answer);
        
        // add several integers and display their sum
        answer = ml.addNums(firstNum, secondNum, thirdNum, fourthNum, 22, 14, 180);
        System.out.println("The sum of the various integers is " + answer);
    }
}
