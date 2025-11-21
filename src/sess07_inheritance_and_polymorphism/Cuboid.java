package sess07_inheritance_and_polymorphism;

/**
 *The {@code Cuboid} class represents a 2-dimentional cuboid with its 
 * length,width and breadth (depth). It provides methods to compute its
 * surface and volume
 * @author todoi
 */
public class Cuboid extends Rectangle
{
    //=============================================
    // Instance fields
    //=============================================
    /**
     * The breadth of the 
     */
   private int breadth;
   
    //=============================================
    // Getters and Setters
    //=============================================
    /**
     * returns the breadth of the cuboid (in units)
     * @return the breadth
     */
    public int getBreadth()
    {
        return breadth;
    }

    /**
     * @param breadth the breadth to set
     */
    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }
    
    //=============================================
    // Constructors
    //=============================================
    
    public Cuboid()
    {
        super(); // call the parentsuper class constructor
        this.breadth = 0;
        this.name = "Cuboid"; // change the name from rectangle to cuboid
    }
    
    public Cuboid(int length, int width, int breadth)
    {
        super(length, width);
        this.breadth = breadth;
        this.name = "Cuboid";
    }
    
    //=============================================
    // Instance methods
    //=============================================
    
    /**
     * Calculates and returns the cuboid's surface area(in square units)
     * 
     * @return  the rectangle's area (in square units)
     */
     protected long calcSurfaceArea()
    {
        return 2 *(this.calcArea() + width * breadth + length * breadth); // 2(lw + wb+ lb
    }

    protected long calcVolume()
    {
        return this.calcArea() * this.breadth;
    }
    
    //=============================================
    // Overriden methods
    //=============================================
    @Override
    public String toString()
    {
        return this.getName() + " Details"
                + "\n" + "-".repeat(50)
                + "\n Length: " + this.length
                + "\n Width: " + this.width
                + "\n breadth: " + this.breadth
                + "\n Surface Area: " + this.calcSurfaceArea()
                + "\n Volume: " + this.calcVolume()
                + "\n" + "-".repeat(50);
    }
}
