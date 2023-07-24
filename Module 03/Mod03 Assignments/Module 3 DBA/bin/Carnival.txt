/*
 * 
 * The Carnival class takes in input about a person, and based off 
 * this information calculates a ticket price and then prints a ticket
 * 
 * Tristan Darnell
 * 07/24/23
 */
import java.util.Scanner;
public class Carnival {

    public static void printTicket(String name, String id, double price)
    {
        System.out.println("Welcome to the APCS Carnival, " + name + "!");
        System.out.println("Your user ID is " + id);
        System.out.println("The cost of your ticket is $" + price + ".");
        System.out.println("Have a great time at the APCS Carnival today!");
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name (first last): ");
        String name = in.nextLine();

        System.out.print("Enter your age: ");
        String age = in.next();
        in.nextLine();

        System.out.print("Are you a first responder (Y/N): ");
        String firstResponder = in.next();
        in.nextLine();

        System.out.print("Are you a veteran (Y/N): ");
        String veteran = in.next();
        in.nextLine();

        double price;

        int intAge = Integer.parseInt(age);
        if (intAge < 3)
        {
            price = 2;
        }
        else if (intAge >= 3 && intAge <= 5)
        {
            price = 9;
        }
        else if (intAge >= 6 && intAge <= 18)
        {
            price = 11;
        }
        else
        {
            price = 12;
        }
        if (veteran.equalsIgnoreCase("Y") || firstResponder.equalsIgnoreCase("Y"));
        {
            price /= 2;
        }

        int randomNum = (int) (Math.random() * 1000 + 1);

        int space = name.indexOf(" ");
        String id = name.substring(0, 1) + name.substring(space+1, space+2) + randomNum;

        printTicket(name, id, price);

        in.close();
    }
}
