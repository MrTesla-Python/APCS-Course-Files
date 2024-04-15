/**
 * This class defines PrimeNumbers object
 *
 * @Tristan Darnell
 * @12/28/23
 */
import java.util.ArrayList;

public class PrimeNumber {
    int lower;
    int upper;

    public PrimeNumber(int lower, int upper)
    {
        this.lower = lower;
        this.upper = upper;
    }


    // Checks all prime numbers and adds to a list that's in a specified range
    public ArrayList<Integer> calcPrimeNumbers()
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = lower; i <= upper; i++)
        {
            if (checkPrime(i, 2))
            {
                ans.add(i);
            }
        }
        return ans;
    }


    // Checks recursively if a number is prime
    static boolean checkPrime(int num, int currD)
    {
        if (num <= 2)
        {
            return (num == 2) ? true : false;
        }
        if (num % currD == 0)
        {
            return false;
        }
        if (currD * currD > num)
        {
            return true;
        }

        return checkPrime(num, currD + 1);
    }
}
