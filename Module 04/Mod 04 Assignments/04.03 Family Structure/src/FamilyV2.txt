/*
 * 
 * The Family clas takes input from a text file
 * that has different values showing what types of kids families have
 * and then averages the different types.
 * 
 * Tristan Darnell
 * 07/24/23
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FamilyV2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/familyMembers.txt");
        Scanner in = new Scanner(file);
        int twoGirls = 0;
        int twoBoys = 0;
        int oneOne = 0;
        int total = 0;
        String newKids = "";

        while(in.hasNextLine())
        {
            newKids = in.nextLine();
            if (newKids.equalsIgnoreCase("BB"))
            {
                twoBoys++;
                total++;
            }
            else if(newKids.equalsIgnoreCase("GG"))
            {
                twoGirls++;
                total++;
            }
            else if (newKids.equalsIgnoreCase("BG") || newKids.equalsIgnoreCase("GB"))
            {
                oneOne++;
                total++;
            }
            else
            {
                continue;
            }
        }
        System.out.println(newKids);
        System.out.println("Composition statistics for families with two children.");
        System.out.println();
        System.out.println("Total number of families: " + total);
        System.out.println();
        System.out.println("Number of families with");

        double percentAllBoys = (double) twoBoys / (double) total;
        percentAllBoys *= 100.0;
        percentAllBoys = (Math.round(percentAllBoys * 100) / 100.0);

        double percentAllGirls = (double) twoGirls / (double) total;
        percentAllGirls *= 100.0;
        percentAllGirls = (Math.round(percentAllGirls * 100) / 100.0);

        double percentBoth = (double) oneOne / (double) total;
        percentBoth *= 100.0;
        percentBoth = (Math.round(percentBoth * 100) / 100.0);
        
        System.out.println("\t   2 boys: " + twoBoys + " represents " + percentAllBoys + "%");
        System.out.println("\t  2 girls: " + twoGirls + " represents " + percentAllGirls + "%");
        System.out.println("1 boy and 1 girl: " + oneOne + " represents " + percentBoth + "%");

        in.close();
    }
}
