package sess09_exceptions;

/**
 * Java program to demonstrate some common exceptions with arrays and strings
 * 
 * @author todoi
 */
public class ArrayAndStringExceptions
{
    //===============
    // class methods
    //=================
    //1. Trying to access an index that doesn't exist
    private static void demoArrayIndexOutOfBoundsException()
    {
        System.out.println("1. ArrayIndexOutOfBoundsException");
        System.out.println("-> Occurs when you try to access an array with an " + "invalid index\n");
        
        int[] numbers = {10, 20, 30, 40, 50};
        try
        {
            System.out.println("Try to access index 10, while the array size " + "is: " + numbers.length + "...");
            System.out.println("Element at index 10 is : " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException aiobe)
        {
            System.err.println("Caught: " + aiobe + ""
            + "\nMessage: " + aiobe.getLocalizedMessage()
            + "\nValid indices are 0 to " + (numbers.length -1));
        }
    }
    
    //2. Using a null array reference
    private static void demoNullPointerException()
    {
        System.out.println("2. NullPointerException (Array)");
        System.out.println("-> Occurs when you try to use an array that is null\n");
        
        int[] data = null;
        try
        {
            System.out.println("Try to get the number of elements(length) the " + "null data array " + data.length + "...");
        } catch (NullPointerException npe)
        {
            System.err.println("Caught: " + npe + ""
                    + "\nYou must first initialize the data array: "
                    + "\nSuggested fix/solution int[] data = new int [5]; // or any "
                    + "other number for array size. ");
        }
    }
    
    //3. Storing the wrong type in an object[] array
    private static void demoArrayStoreException()
    {
        System.out.println("3. ArrayStoreException (Array)");
        System.out.println("-> Occurs when you try to store incompatible types " + "in an array. \n");
        //Declare an object array
        Object[] objects = new String[3];
        try
        {
            // store elements in the objects array
            objects[0] = "Hello";
            objects[1] = "World";
            objects[2] = 123; // this will fail
            System.out.println("This line wont print!");
        } catch (ArrayStoreException ase)
        {
            System.err.println("Caught: " + ase + ""
                    + "\nCannot store the integer primitives in a String[] array: " );
        }
    }
    
    // 4. Creating an array with negative size
    private static void demoNegativeArraySizeException()
    {

        System.out.println("4. NegativeArraySizeException :");
        System.out.println("Occurs when you try use a negative value for the array size.");

        int size = -4;

        try
        {
            int[] mass = new int[size];
            System.out.println("The mass array has been successfully created");
        } catch (NegativeArraySizeException nass)
        {
            System.err.println("Caught: " + nass
                    + "\nThe size of the array cannot be negative!");
        }
    }

}
