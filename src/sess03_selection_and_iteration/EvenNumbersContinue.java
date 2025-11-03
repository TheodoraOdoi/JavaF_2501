package sess03_selection_and_iteration;

/**
 *Java program that displays the even numbers between 20 - 50 using a for 
 * loop and the continue keyword.
 * 
 * @author todoi
 */
public class EvenNumbersContinue
{
    // main method begins program execution
    public static void main(String[] args)
    {
        System.out.println("Even numbers between 20 t0 50");
        
        for (int n = 20; n = <= 50; n++)
        {
            if(n % 2 != 0)
            {
                continue;
            }
        }
        System.out.println(n);
    }
}
