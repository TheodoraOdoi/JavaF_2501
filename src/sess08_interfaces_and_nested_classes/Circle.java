package sess08_interfaces_and_nested_classes;

import sess07_inheritance_and_polymorphism.Shape;

/**
 *
 * @author todoi
 */
public class Circle extends Shape implements I2DShape
{
    //=============================================
    // Instance fields
    //=============================================
    /**
     * The length of the rectangle (in units)
     */
    protected int length;
    
    /**
     * The width of the rectangle (in units)
     */
    protected int width;
    int radius;

    //=============================================
    // Getters and Setters
    //=============================================
    /**
     * returns the length of the rectangle (in units)
     * 
     * @return the rectangle's length (in units)
     */
    public int getLength()
    {
        return length;
    }
    
    public void setLength(int length)
    {
        this.length = length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }
    
    //=============================================
    // Constructors
    //=============================================
    
    public Circle()
    {
        this.radius = 0;
        this.name = "Circle";
    }
    
    public Circle(int radius)
    {
        this.radius = radius;
        this.name = "Circle";
    }
    
    //=============================================
    // Instance methods
    //=============================================
    
    /**
     * Calculates and returns the rectangle's area(in square units)
     * 
     * @return  the rectangle's area (in square units)
     */
     protected long calcArea()
    {
        return length * width;
    }

    protected long calcCircumference()
    {
        return 2 * (length + width);
    }
    
    //=============================================
    // Overriden methods
    //=============================================
    
    @Override
    public String getName()
    {
        return Circle;
    }
    
    @Override
    public float calcArea()
    {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
    
    public float calcCircumference()
    {
        return (float) (Math.PI * (radius * 2));
    }
    
    @Override
    public String toString()
    {
        return this.getName() + " Details"
                + "\n" + "-".repeat(50)
                + "\n radius: " + this.radius
                + "\n Area: " + this.calcArea()
                + "\n Circumference: " + this.calcCircumference()
                + "\n" + "-".repeat(50);
    }

    @Override
    public float calcSurfaceArea()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float calcVolume()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setRadius(int i)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
