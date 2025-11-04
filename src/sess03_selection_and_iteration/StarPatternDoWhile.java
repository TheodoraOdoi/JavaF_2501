package sess03_selection_and_iteration;

/**
 * Java program to display a star pattern using nested do...while loops.
 * 
 * @author todoi
 */
public class StarPatternDoWhile
{
    // main method begins program execution
    public static void main(String[] args)
    {
        // variables to be used in the program
        int row = 1, col;
        do //outer loop
        {
            col = 1;
            do // inner loop
            {
                System.out.printf("* ");
                col++;
            }while(col <= row);
            System.out.println("");
            row++;
        }while(row <= 5);
    }
}
