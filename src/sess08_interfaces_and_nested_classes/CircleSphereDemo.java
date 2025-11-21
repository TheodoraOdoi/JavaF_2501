package sess08_interfaces_and_nested_classes;

import java.util.Scanner;

/**
 * Java program to demonstrate declaring and instantiating {@code circle} and
 * sphere objects & displaying their details.
 * 
 * @author todoi
 */
public class CircleSphereDemo
{
    // main method begins program execution
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
        //Declare Circle & sphere objects
        Circle c1, c2;
        Sphere s1, s2;
        
        // Prompt the user 4 the radius of c2 & s2
        System.out.println("Please enter the radius of the circle in cm:\n");
        int rad = sc.nextInt();
        System.out.println("Please enter the radius of the sphere in cm:\n");
        int rad2 = sc.nextInt();
        
        // Instantiate the circles, then the spheres
        c1 = new Circle(); // using default constructors
        c1.setRadius(7);
        c2 = new Circle(rad); //using the parameterised constructor
        
        s1 = new Sphere(); // using default constructors
        s1.setRadius(7);
        s2 = new Sphere(rad2); //using the parameterised constructor
        
        // Displat the dimentions of d circles & spheres
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
