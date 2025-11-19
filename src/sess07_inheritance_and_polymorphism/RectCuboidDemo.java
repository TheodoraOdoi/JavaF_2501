package sess07_inheritance_and_polymorphism;

import java.util.Scanner;

/**
 * Java class to demonstrate creating Rectangle and cuboid objects.
 * 
 * @author todoi
 */
public class RectCuboidDemo
{
    // main method begins program execution
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //Prompt the user for the dimentions of the rectangle
        System.out.println("Please enter the rectangle's length in cm:\n");
        int length = sc.nextInt();
        
        System.out.println("Please enter the rectangle's width in cm:\n");
        int width = sc.nextInt();
        
        // Declare and instantiatena rectangle object with the user's dimentions
        Rectangle rect1 = new Rectangle(length, width);
        
        // Display the rectangles dimentions
        System.out.println(rect1);
        
        // Declare a cuboid, then hard-code it's values
        Cuboid cb1;
        cb1 = new Cuboid(8,5,2);
        
        // Display the cuboid's dimentions
        System.out.println(cb1);
    }
    
}
