package sess09_exceptions;

/**
 *
 * @author todoi
 */
/**
 * Custom exception thrown when an attempt is made to divide a number by zero.
 * 
 * <p>This exception extends {@link ArithmeticException} to provide more specific
 * semantic meaning in applications where distinguishing division by zero from
 * other arithmetic errors is important (e.g., calculators, financial systems,
 * scientific computations).</p>
 * 
 * <p>Although {@code ArithmeticException} is already thrown by the JVM for
 * {@code /} and {@code %} operations with a zero divisor, wrapping or replacing
 * it with {@code DivideByZeroException} allows for more precise exception handling
 * and clearer intent in the code.</p>
 * 
 * <p>Example usage:</p>
 * <pre>{@code
 * public double divide(double a, double b) {
 *     if (b == 0) {
 *         throw new DivideByZeroException("Cannot divide " + a + " by zero");
 *     }
 *     return a / b;
 * }
 * }</pre>
 * 
 * @author todoi
 * @since 1.0
 */
public class DivideByZeroException extends ArithmeticException
{
    /**
     * Constructs a new {@code DivideByZeroException} with the specified detail message.
     * 
     * @param message the detail message explaining the reason for the exception.
     *                The message can be retrieved later by the {@link Throwable#getMessage()} method.
     */
    // constructor
    public DivideByZeroException(String message)
    {
        super(message);
    }
    
    /**
     * Constructs a new {@code DivideByZeroException} with a default message.
     * 
     * <p>Default message: "Division by zero is not allowed"</p>
     */
    public DivideByZeroException() {
        super("Division by zero is not allowed");
    }
    
}
