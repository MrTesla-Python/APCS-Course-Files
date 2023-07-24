import java.util.Scanner;
public class TDEE {
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
    }
}
