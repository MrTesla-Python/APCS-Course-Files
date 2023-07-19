
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and 
 * decimals, as well as using ints
 *  
 * @ Tristan Darnell
 * @ 19 July 2023
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {

        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(43.21 + " + " + 3.14 + " = " + (43.21 + 3.14));
        System.out.println();
        
        // Subtraction
        int iNum3 = 11;
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println("3.14 - 10.0 = " +  (3.14 - 10.0));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2)); 
        System.out.println("3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println("43.21 / 10.0 = " + (43.21 / 10.0));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println("10.0 % 3.14 = " + (10.0 % 3.14));
        System.out.println();
        
        // 1.08 Additional int Equations
        int iNum4 = 3;
        int iNum5 = 6;
        int iNum6 = 23;
        System.out.println("Additional int equations");
        System.out.println(iNum4 + " + " + iNum5 + " * " + iNum6 + " = " + (iNum4 + iNum5 * iNum6));
        System.out.println(iNum5 + " / " + iNum6 + " - " + iNum3 + " = " + (iNum5 / iNum6 - iNum3));
        System.out.println(iNum2 + " % " + iNum1 + " * " + iNum6 + " = " + (iNum2 % iNum1 * iNum6));
        
        // 1.09 Additional double Equations
        
               
    } // end of main method
} // end of class
