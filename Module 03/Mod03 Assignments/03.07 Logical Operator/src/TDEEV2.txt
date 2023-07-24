/*
 * 
 * The TDEE class takes information about the user,
 * and uses this information to calculate and display theire TDEE.
 * 
 * Tristan Darnell
 * 07/24/23
 */
import java.util.Scanner;
public class TDEEV2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        System.out.print("Please enter your BMR: ");
        String BMR = in.next();
        in.nextLine();

        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        in.nextLine();

        System.out.println();
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");

        System.out.println();

        System.out.print("Enter the letter corresponding to your activity level: ");

        String option = in.next();
        in.nextLine();

        System.out.println();
        System.out.println();

        System.out.println("Your results:");
        System.out.print("Name: " + name);
        System.out.println("\t\tGender: " + gender.toUpperCase());

        double activityFactor = 0;

        if (option.equalsIgnoreCase("A") && (gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("M")))
        {
            activityFactor = 1.0;
        }
        else if (option.equalsIgnoreCase("B") && (gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("M")))
        {
            activityFactor = 1.3;
        }
        else if (option.equalsIgnoreCase("C") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.5;
        }
        else if (option.equalsIgnoreCase("C") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 1.6;
        }
        else if (option.equalsIgnoreCase("D") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.6;
        }
        
       else if (option.equalsIgnoreCase("D") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 1.7;
        }

        else if (option.equalsIgnoreCase("E") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.9;
        }
        else if (option.equalsIgnoreCase("E") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 2.1;
        }
        else if (option.equalsIgnoreCase("F") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 2.2;
        }
        else if (option.equalsIgnoreCase("F") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 2.4;
        }
        else 
        {
            System.out.println("Invalid Menu Input");
        }
        double doubleBMR = Double.parseDouble(BMR);
        System.out.print("BMR: " + doubleBMR + " calories");
        System.out.println("\t\tActivty Factor: " + activityFactor);

        double TDEE = activityFactor * doubleBMR;

        System.out.println("TDEE: " + TDEE);
        in.close();
    }
}
