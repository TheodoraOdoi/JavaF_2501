package sess09_exceptions;

import util.Spacer;
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
    
    // 5. String index out of bounds
    private static void demoStringIndexOutOfBoundsException()
    {

        System.out.println("5. StringIndexOutOfBoundsException :");
        System.out.println("Occurs when you try to access a string with an " + "invalid index.\n");

        String str = "Hello";
        try
        {
            System.out.println("Accessing index 10 in the string...");
            System.out.println("Character at index 10: " + str.charAt(10)); // invalid index
        } catch (StringIndexOutOfBoundsException sioobe)
        {
            System.err.println("Caught: " + sioobe
                    + "\nMessage: " + sioobe.getLocalizedMessage());
        }
    }
    
    //6.NumberFormatException
    private static void demoNumberFormatException()
    {
        System.out.println("6. NumberFormtException ");
        System.out.println("-> Occurs when you try to parse a string to a" + "number but it's not a valid number.\n");
        String number = "two";
        try
        {
            int num = Integer.parseInt(number); //will fail as java can't convert "two" to 2
            System.out.println("Parsed number: " + num);
        }
        catch (NumberFormatException nfe)
        {
            System.err.println("Caught: " + nfe + "\nMessage: " + nfe.getLocalizedMessage());
        }
    }
    
    // 7. Null pointer Exception with strings
    private static void demoNullPointerExceptionWithStrings()
    {

        System.out.println("7. NullPointerExceptionWithStrings :");
        System.out.println("Occurs when you try to parse a string to a " + "number but it's not a valid number.\n");

        String str = null;
        try
        {
            System.out.println("Trying to call length() on a null string: " + str.length()); // will fail
        } catch (NullPointerException npe)
        {
            System.err.println("Caught: " + npe
                    + "\nMessage: " + npe.getLocalizedMessage());
        }
    }
    
    // 8. Class Cast Exception
    private static void demoClassCastException()
    {

        System.out.println("8. ClassCastException :");
        System.out.println("Occurs when you try to cast an object to an " + "incompatible class.\n");

        Object obj = "Hello";
        try
        {
            Integer num = (Integer) obj; // invalid cast
            System.out.println("Casted number" + num);
        } 
        catch (ClassCastException cce)
        {
            System.err.println("Caught: " + cce
                    + "\nMessage: " + cce.getLocalizedMessage());
        }
    }
    
    // 9. ArrayIndexOutOfBoundsException with multi-dimensional arrays
    private static void demoMultiDimensionalArrayIndexOutOfBoundsException()
    {
        System.out.println("9. ArrayIndexOutOfBoundsException (Multi-dimensional)");
        System.out.println(" -> Occurs when accessing an invalid index in a multi-dimensional array.\n");

        int[][] multiArray =
        {
            {
                1, 2, 3
            },
            {
                4, 5, 6
            }
        };

        try
        {
            System.out.println("Accessing invalid index [2][1] in the multi-dimensional array...");
            System.out.println("Element: " + multiArray[2][1]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException aiobe)
        {
            System.err.println("Caught: " + aiobe + "\nMessage: " + aiobe.getLocalizedMessage());
        }
    }
    
    // main method begins program execution
    public static void main(String[] args)
    {
        // call the above methods to demonstrate various array & string exceptions 
        demoArrayIndexOutOfBoundsException();
        Spacer.separator();
        
        demoNullPointerException();
        Spacer.separator();
        
        demoArrayStoreException();
        Spacer.separator();
        
        demoNegativeArraySizeException();
        Spacer.separator();
        
        demoStringIndexOutOfBoundsException();
        Spacer.separator();
        
        demoNumberFormatException();
        Spacer.separator();
        
        demoNullPointerExceptionWithStrings();
        Spacer.separator();
        
        demoClassCastException();
        Spacer.separator();
        
        demoMultiDimensionalArrayIndexOutOfBoundsException();
        Spacer.separator();
    }
    
}
