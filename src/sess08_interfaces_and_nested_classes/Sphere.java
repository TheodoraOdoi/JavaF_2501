package sess08_interfaces_and_nested_classes;

/**
 *
 * @author todoi
 */
/**
 * Represents a three-dimensional sphere, extending the 2D {@link Circle} class
 * and implementing the {@link I3DShape} interface.
 * 
 * <p>A {@code Sphere} inherits the radius and area calculation from {@code Circle},
 * but provides additional 3D properties: surface area and volume.</p>
 *
 * <p>All measurements assume units in meters (m), square meters (m²), and cubic meters (m³)
 * for consistency and real-world readability.</p>
 *
 * <p>Key formulas used:</p>
 * <ul>
 *   <li>Surface Area = 4 × π × r²</li>
 *   <li>Volume = (4/3) × π × r³</li>
 * </ul>
 * 
 * @author todoi
 * @version 1.0
 * @see Circle
 * @see I3DShape
 */
public class Sphere extends Circle implements I3Dshape
{
    //=============================================
    // Constructors
    //=============================================
    
    /**
     * Constructs a default {@code Sphere} with radius 0.
     * The name is set to "Sphere".
     */
    public Sphere()
    {
        super(); // Calls Circle() → radius = 0
        this.name = "Sphere";
    }
    
    /**
     * Constructs a {@code Sphere} with the specified radius.
     * 
     * @param radius the radius of the sphere (must be >= 0)
     * @throws IllegalArgumentException if radius is negative
     */
    public Sphere(int radius)
    {
        super(radius); // Calls Circle(int radius) with validation
        this.name = "Sphere";
    }

    //=============================================
    // 3D Calculations (I3DShape implementation)
    //=============================================
    
    //=============================================
    // Overriden methods
    //=============================================
    /**
     * Calculates and returns the total surface area of the sphere.
     * 
     * <p>Formula: 4 × π × r²</p>
     * <p>Reuses {@link Circle#calcArea()} which returns π × r².</p>
     * 
     * @return the surface area in square meters (m²)
     */
    @Override
    public float calcSurfaceArea()
    {
        //4IIr2
        return 4 * this.calcArea();
    }

    /**
     * Calculates and returns the volume of the sphere.
     * 
     * <p>Formula: (4/3) × π × r³</p>
     * <p>Efficiently computed using the circle's area (π × r²) × r × (4/3).</p>
     * 
     * @return the volume in cubic meters (m³)
     */
    @Override
    public float calcVolume()
    {
        //4/3IIr3
        return 4/3.0f * this.calcArea() * this.radius;
    }
    
    //=============================================
    // Object Override
    //=============================================

    /**
     * Returns a formatted string representation of the sphere with its properties.
     * 
     * <p>Example output:</p>
     * <pre>
     * Sphere Details
     * --------------------------------------------------
     *  radius: 5 m.
     *  Surface Area: 314.16 m²
     *  Volume: 523.60 m³
     * --------------------------------------------------
     * </pre>
     * 
     * @return a neatly formatted multi-line string containing sphere details
     */
    @Override
    public String toString()
    {
        //return this.getName() + " Details"
                //+ "\n" + "-".repeat(50)
                //+ "\n Radius: " + this.radius
                //+ "\n Surface Area: " + this.calcSurfaceArea()
                //+ "\n Volume: " + this.calcVolume()
                //+ "\n" + "-".repeat(50);
        return String.format(this.getName() + " Details"
                + "\n" + "-".repeat(50)
                + "\n radius: %d m."
                + "\n Surface Area: %.2f m2"
                + "\n Volume: %.2f m3"
                + "\n" + "-".repeat(50),
                this.radius, this.calcSurfaceArea(), this.calcVolume());
    }
}
