/*
 * 
 * The SecretPasscode class takes user input
 * for password length that must be at least six and then randomly generates
 * a password of letters and numbers.
 * 
 * Tristan Darnell
 * 07/25/23
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";

	// initialize scanner and print writer
        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("passwords.txt"));
        

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
	    
        String yesOrNo = "Y";

        do
        {
            int pwLength = 0;
            int randNum = 0; 
            String password = "";

            System.out.print("Enter a password Length (6 or more): ");
            String pl = in.next();
            in.nextLine();
            int passwordLength = Integer.parseInt(pl);

            if (passwordLength < 6)
            {
                do
                {
                    System.out.println("\tPassword length too short. Please try again.");
                    System.out.print("Enter a password Length (6 or more): ");
                    pl = in.next();
                    in.nextLine();
                    passwordLength = Integer.parseInt(pl);
                }
                while (passwordLength < 6);
            }


            for (int i = 0; i < passwordLength; i++)
            {
                int randomChar = (int) (Math.random() * 75) + 48;
                while ((randomChar > 57 && randomChar < 65) || (randomChar > 90 && randomChar < 97))
                {
                    randomChar = (int) (Math.random() * 75) + 48;
                }
                password += (char) randomChar;
            }
            

            outFile.println(password);
            System.out.println();
            System.out.println("A password has been written to the text file.");

            System.out.print("Would you like to generate annother password? Y/N ");
            yesOrNo = in.next();
            in.nextLine();
            
        }
        while (!(yesOrNo.equalsIgnoreCase("N")));

        System.out.println();
        System.out.println("Thanks for using the Pass Code Generator.");

        outFile.close();

        System.out.println();
        System.out.println("Here are your randomly generated codes.");

        File file = new File("passwords.txt");
        Scanner inFile = new Scanner(file);
        while(inFile.hasNext())
        {
            System.out.println("\t" + inFile.nextLine());
        }

        inFile.close();
        

  }//end main
}//end class

