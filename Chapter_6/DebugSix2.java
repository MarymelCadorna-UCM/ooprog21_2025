// Display every character between Unicode 65 and 122
// Start new line after 20 characters
import java.util.Scanner;

public class DebugSix2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        char letter;
        int a;
        int min;
        final int MAX = 122;
        final int NUMBER_PER_LINE = 20;
        int count = 0;

        System.out.println("Enter a Unicode value to start.");
        System.out.print("For example, A is 65 >> ");
        min = keyboard.nextInt();

        for (a = min; a <= MAX; a++)
        {
            letter = (char)a;
            System.out.print(" " + letter);
            count++;

            if (count == NUMBER_PER_LINE)
            {
                count = 0;
                System.out.println();
            }
        }

        System.out.println("\nEnd of application");
    }
}
