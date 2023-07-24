/*
 * 
 * The BuyCandy class takes in lines of input that 
 * corresponds to what candy a person bought, and then prints
 * a reciept with this information
 * 
 * Tristan Darnell
 * 07/23/23
 */
import java.util.Scanner;
public class BuyCandyV2 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);


        // Get first and last name
        System.out.println("Good Evening and welcome to Candy Land.");
        System.out.print("Please enter your first and last name: ");
        String first = in.next();
        String last = in.nextLine();

        // Get today's date
        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String date = in.nextLine();

        // Get the candy they want
        System.out.print("What candy would you like to buy? ");
        String candy = in.nextLine();

        // Get quantity
        System.out.print("How many bags of " + candy + ": ");
        String quantity = in.nextLine();

        // Price of item
        System.out.print("What is the candy price? ");
        String price = in.nextLine();

        // Get debit card number
        System.out.print("Enter your debit card number (#####-###-####): ");
        String debitCardNumber = in.nextLine();

        // get debit pin
        System.out.print("Enter your PIN (#####): ");
        String debitCardPin = in.nextLine();

        // Print Reciept
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("Your e-Reciept");

        System.out.println();

        // Reformating the date
        date = date.replace("/", "-");
        System.out.println(date);

        // Print order number
        System.out.println("Order number: " + candy.substring(1, 3) + debitCardNumber.substring(6, 9));

        System.out.println();

        // Get the first initial of first name then print name
        String firstInitial = first.substring(0, 1);
        System.out.println("\t" + firstInitial + ". " + last);

        // Print the Debit card number with all but last 4 digits blurred
        String partDebit = debitCardNumber.substring(10);
        System.out.println("\tAccount #####-###-" + partDebit);

        // Print the candy
        System.out.println("\tCandy: " + candy);

        // Parse quantity as int and then Print quantity
        int n = Integer.parseInt(quantity);
        System.out.println("\tNumber of bags of " + candy + ": " + n);

        // Parse price as double and print ticket price
        price = price.replace("$", "");
        double doublePrice = Double.parseDouble(price);
        System.out.println("\tCandy Price: " + doublePrice);
        
        System.out.println();

        // Print total amount
        double total = n * doublePrice;
        System.out.println("\t$" + total + " will be debited to your account.");

        System.out.println();
        System.out.println("\tThank you. Enjoy your candy tonight.");

        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
    }
}
