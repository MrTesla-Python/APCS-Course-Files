
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and 
 * decimals, as well as using ints and doubles
 *  
 * @ Tristan Darnell
 * @ 19 July 2023
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {

        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;

        // Declare double variables
        double dNum1 =  43.21;
        double dNum2 = 3.14;

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();
        
        // Subtraction
        int iNum3 = 11;
        double dNum3 = 10.0;
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println(dNum2 + " - " + dNum3 + " = " + (3.14 - 10.0));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2)); 
        System.out.println(dNum2 + " * " + dNum3 + " * " + " = " + (3.14 * 10.0 * 10.0));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println(dNum1 + " / " + dNum3 + " = " + (43.21 / 10.0));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println(dNum3 + " % " + dNum2 + " = " + (10.0 % 3.14));
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
        double dNum4 = 5.32;
        double dNum5 = 4.26;
        double dNum6 = 99.83;
        System.out.println("Additional double equations");
        System.out.println(dNum4 + " + " + dNum5 + " * " + dNum6 + " = " + (dNum4 + dNum5 * dNum6));
        System.out.println(dNum5 + " / " + dNum6 + " - " + dNum3 + " = " + (dNum5 / dNum6 - dNum3));
        System.out.println(dNum2 + " % " + dNum1 + " * " + dNum6 + " = " + (dNum2 % dNum1 * dNum6));
               
    } // end of main method
} // end of class
