package sess07_inheritance_and_polymorphism;

/**
 * The {@code Rectangle} class represents a 2-dimentional rectangle 
 * with its length & width. It provides methods to compute its area and perimeter.
 * 
 * @author todoi
 */
public class Rectangle extends Shape
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

    /**
     * @return the length
     */
    public int getLength()
    {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length)
    {
        this.length = length;
    }

    /**
     * @return the width
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    //=============================================
    // Constructors
    //=============================================
    public Rectangle()
    {
        this.length = 0;
        this.width = 0;
        this.name = "Rectangle";
    }
    
    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
        this.name = "Rectangle";
    }
    
    //=============================================
    // Instance methods
    //=============================================
    
    /**
     * Calculates and returns the rectangle's area(in square units)
     * 
     * @return  the rectangle's area (in square units)
     */
     private String calcArea()
    {
        return length * width;
    }

    private String calcPerimeter()
    {
        return 2 * (length + width);
    }
    
    //=============================================
    // Overriden methods
    //=============================================
    @override
    public String getName()
    {
        return this.name;
    }
    
    @Override
    public String toString()
    {
        return this.getName() + " Details"
                + "\n" + "-".repeat(50)
                + "\n Length: " + this.length
                + "\n Width: " + this.width
                + "\n Area: " + this.calcArea()
                + "\n Perimeter: " + this.calcPerimeter()
                + "\n" + "-".repeat(50);
    }


}
