package sess08_interfaces_and_nested_classes;

/**
 * The {@code I3DShape} interface represents a 2-dimentional geometric
 * shape. it defines contracts for calculating the area of the shape
 * Any class that implements this interface must provide its own implementation 
 * of the {@li #calArea()} method.
 * 
 * @author todoi
 * @version 1.0
 */
public interface I2DShape
{
    /**
     * Calculates the area of the shape as a {@code float}
     * 
     * @return the area of the shape as a {@code float}. The surface
     * area is typically expressed in a square unit(e.g., square cm or feet)
     */
    public float calcSurfaceArea();
    
        /**
     * Calculates the volume of the shape as a {@code float}. 
     * 
     * @return The volume of the shape as a {@code float}. The volume is
     * typically expressed in cubic units(e.g., cubic cm or feet)
     */
        public float calcVolume();
}
