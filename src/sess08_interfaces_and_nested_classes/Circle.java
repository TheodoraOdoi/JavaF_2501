package sess08_interfaces_and_nested_classes;

import sess07_inheritance_and_polymorphism.Shape;

/**
 *
 * @author todoi
 */
/**
 * Represents a circle in a 2D plane, inheriting common shape properties and implementing
 * two-dimensional shape behavior.
 * 
 * <p>A {@code Circle} is defined by its radius and provides methods to calculate its
 * area and circumference. It extends {@link Shape} to inherit common attributes such as
 * {@code name}, and implements {@link I2DShape} to ensure it supports 2D geometric operations.</p>
 * 
 * <p>All measurements are assumed to be in generic "units" (e.g., pixels, meters, etc.),
 * depending on the context of the application.</p>
 * 
 * <p><strong>Note:</strong> This class uses {@code int} for radius to support integer-based
 * graphics or educational contexts. For high-precision applications, consider using {@code double}.</p>
 * 
 * @author todoi
 * @version 1.0
 * @see Shape
 * @see I2DShape
 */
public class Circle extends Shape implements I2DShape {

    //=============================================
    // Instance Fields
    //=============================================

    /**
     * The radius of the circle in units. Must be non-negative.
     * A value of 0 represents a degenerate circle (a single point).
     */
    protected int radius;

    //=============================================
    // Constructors
    //=============================================

    /**
     * Constructs a default {@code Circle} with radius 0.
     * The name is automatically set to "Circle".
     */
    public Circle() {
        this.radius = 0;
        this.name = "Circle";
    }

    /**
     * Constructs a {@code Circle} with the specified radius.
     * 
     * @param radius the radius of the circle (must be >= 0)
     * @throws IllegalArgumentException if radius is negative (optional validation can be added)
     */
    public Circle(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative: " + radius);
        }
        this.radius = radius;
        this.name = "Circle";
    }

    //=============================================
    // Getters and Setters
    //=============================================

    /**
     * Returns the radius of this circle.
     * 
     * @return the radius in units
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets the radius of this circle.
     * 
     * @param radius the new radius value (must be >= 0)
     * @throws IllegalArgumentException if radius is negative
     */
    public void setRadius(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative: " + radius);
        }
        this.radius = radius;
    }

    //=============================================
    // Geometric Calculations
    //=============================================

    /**
     * Calculates and returns the area of this circle.
     * 
     * <p>Formula: π × r²</p>
     * 
     * @return the area of the circle as a {@code float}
     */
    @Override
    public float calcArea() {
        return (float) (Math.PI * radius * radius);
    }

    /**
     * Calculates and returns the circumference (perimeter) of this circle.
     * 
     * <p>Formula: 2 × π × r</p>
     * 
     * @return the circumference of the circle as a {@code float}
     */
    public float calcCircumference() {
        return (float) (2 * Math.PI * radius);
    }

    //=============================================
    // Object Overrides
    //=============================================

    /**
     * Returns the name of this shape.
     * 
     * @return always returns "Circle"
     */
    @Override
    public String getName() {
        return this.name; // name is inherited from Shape
    }

    /**
     * Returns a formatted string containing details about this circle.
     * 
     * <p>Example output:</p>
     * <pre>
     * Circle Details
     * --------------------------------------------------
     *  Radius: 5
     *  Area: 78.53982
     *  Circumference: 31.415926
     * --------------------------------------------------
     * </pre>
     * 
     * @return a multi-line string representation of the circle
     */
    @Override
    public String toString() {
        return this.getName() + " Details" +
               "\n" + "-".repeat(50) +
               "\n Radius: " + this.radius +
               "\n Area: " + String.format("%.6f", this.calcArea()) +
               "\n Circumference: " + String.format("%.6f", this.calcCircumference()) +
               "\n" + "-".repeat(50);
    }
}