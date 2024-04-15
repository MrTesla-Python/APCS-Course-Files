/**
 * This class tests the PrimeNumbers class
 *
 * @Tristan Darnell
 * @12/28/23
 */
import java.util.*;
public class testPrimeNumber {
    public static void main(String[] args)
    {
        int lower;
        int upper;
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter a lower bound (1-100)");
            lower = in.nextInt();
            in.nextLine();

            if (lower >= 1 && lower <= 100)
            {
                break;
            }
            else
            {
                System.out.println("That is not in the range");
            }
        }
        while (true)
        {
            System.out.print("Enter a upper bound (25-500)");
            upper = in.nextInt();
            {
                if (upper >= 25 && upper <= 500 && upper > lower)
                {
                    break;
                }
                else
                {
                    System.out.println("That is not in the range or is not greater than the lower bound");
                }
            }
        }

        PrimeNumber checkPrimes = new PrimeNumber(lower, upper);
        ArrayList<Integer> allPrimes = checkPrimes.calcPrimeNumbers();
        System.out.println("The Prime Numbers in your given range (" + lower + "-" + upper +") were:");
        for (int i = 0; i < allPrimes.size(); i++)
        {
            System.out.print(allPrimes.get(i) + " ");
        }
        in.close();
    }
}
