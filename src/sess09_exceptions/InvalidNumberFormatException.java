package sess09_exceptions;

/**
 *
 * @author todoi
 */
/**
 * Custom checked exception thrown when a string or input cannot be parsed or converted
 * into a valid numeric type due to an invalid format.
 * 
 * <p>This exception is typically used when stricter control or more meaningful error
 * messages are required than what {@link java.lang.NumberFormatException} provides.
 * Unlike {@code NumberFormatException} (which is unchecked), this is a <strong>checked exception</strong>,
 * forcing callers to handle or declare it — useful in APIs, configuration parsers,
 * user input validation, or financial applications where invalid number formats
 * are recoverable errors.</p>
 * 
 * <p>Common use cases:</p>
 * <ul>
 *   <li>Parsing user input in forms or configuration files</li>
 *   <li>Validating numeric strings with specific patterns (e.g., positive integers only)</li>
 *   <li>Providing user-friendly error messages instead of raw {@code NumberFormatException}</li>
 * </ul>
 * 
 * <p>Example usage:</p>
 * <pre>{@code
 * public int parsePositiveInteger(String input) throws InvalidNumberFormatException {
 *     try {
 *         int value = Integer.parseInt(input);
 *         if (value <= 0) {
 *             throw new InvalidNumberFormatException("Value must be a positive integer: " + input);
 *         }
 *         return value;
 *     } catch (NumberFormatException e) {
 *         throw new InvalidNumberFormatException("Not a valid integer: '" + input + "'", e);
 *     }
 * }
 * }</pre>
 * 
 * @author todoi
 * @since 1.0
 */
public class InvalidNumberFormatException extends Exception {

    /**
     * Constructs a new {@code InvalidNumberFormatException} with the specified detail message.
     * 
     * @param message the detail message describing why the number format is invalid.
     *                The message is saved for later retrieval by {@link #getMessage()}.
     */
    public InvalidNumberFormatException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code InvalidNumberFormatException} with the specified detail message
     * and cause.
     * 
     * <p>Useful when wrapping a lower-level exception such as {@link NumberFormatException}
     * to preserve the stack trace while providing a more meaningful checked exception.</p>
     * 
     * @param message the detail message
     * @param cause   the original cause of the parsing failure (e.g., {@code NumberFormatException})
     */
    public InvalidNumberFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new {@code InvalidNumberFormatException} with the specified cause
     * and a default message derived from the cause.
     * 
     * @param cause the original exception that caused this one
     */
    public InvalidNumberFormatException(Throwable cause) {
        super("Invalid number format", cause);
    }

    /**
     * Constructs a new {@code InvalidNumberFormatException} with a default message
     * and no cause.
     * 
     * <p>Default message: "The provided input has an invalid number format"</p>
     */
    public InvalidNumberFormatException() {
        super("The provided input has an invalid number format");
    }
}
