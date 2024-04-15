/**
 * Purpose: To create a recursion program to calc fib numbers
 *
 * @Tristan Darnell
 * @02/05/24
 *
 */
import java.util.Scanner;

public class Fibonacci {
    public static int calculate(int n) {
        if (n <= 1) {
            return n;
        }
        return calculate(n - 1) + calculate(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer value (or type 'q' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                break;
            }
        int n = Integer.parseInt(input);
        int fibNumber = calculate(n);
        System.out.println("Fibonacci number for " + n + " is " + fibNumber + ".");
        }
    }
}