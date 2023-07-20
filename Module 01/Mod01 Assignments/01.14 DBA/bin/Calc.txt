/**
 * The calc class takes a value and then performs various 
 * arithmetic operations on it, and then prints the results
 *  
 * @ Tristan Darnell
 * @ 19 July 2023
 */
public class Calc {
    public static void main(String[] args) {
        int value = 7;
        int iNum1 = 2;
        System.out.println("The original value is " + value + ".");
        System.out.println("When " + value + " is divided by " + iNum1 + 
        ", the whole number result is " + (value/iNum1) + ".");
        System.out.println("The remainder of " + value + " divided by " + 
        iNum1 + " is " + (value%iNum1) + ".");
        System.out.println("When " + value + " is divided by " + iNum1 + 
        ", the decimal result is " + ((double) value/ (double) iNum1) + ".");
    }
}