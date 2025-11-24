package sess08_interfaces_and_nested_classes;

/**
 * The {@code I3DShape} interface represents a 3-dimensional geometric
 * shape. it defines contracts for calculating the surface area & volume of the 
 * of the {@link #calcSurfaceArea.
 * Any class that implements this interface must provide its own implementation 
 * of the {@link #calcSurfaceArea()}, & {@link #calcVolume()} methods.
 * 
 * @author todoi
 * @version 1.0
 */
public interface I3Dshape
{
    /**
     * Calculates the surface area of the shape as a {@code float}
     * 
     * @return the surface area of the shape as a {@code float}. The surface
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
