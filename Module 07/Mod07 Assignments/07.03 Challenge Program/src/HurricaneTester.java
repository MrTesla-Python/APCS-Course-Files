/**
 * Prints information about hurricans in a date range
 * Tristan Darnell
 * 9/6/23
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class HurricaneTester

{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("src/hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        //create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> hurricaneList = new ArrayList<Hurricane>();
        
        //convert the windspeed, determine categories, calculate sums
        Hurricane hurricane = null;
        for (int i = 0; i < numValues; i++)
        {   // determine cat and create a hurricane object
            if (windSpeeds[i] * 1.15078 <= 95)
            {
                hurricane = new Hurricane(years[i], names[i], months[i], 1, pressures[i], windSpeeds[i] * 1.15078);
            }

            else if (windSpeeds[i] * 1.15078 <= 110)
            {
                hurricane = new Hurricane(years[i], names[i], months[i], 2, pressures[i], windSpeeds[i] * 1.15078);
            }

            else if (windSpeeds[i] * 1.15078 <= 129)
            {
                hurricane = new Hurricane(years[i], names[i], months[i], 3, pressures[i], windSpeeds[i] * 1.15078);
            }

            else if (windSpeeds[i] * 1.15078 <= 156)
            {
                hurricane = new Hurricane(years[i], names[i], months[i], 4, pressures[i], windSpeeds[i] * 1.15078);
            }

            else
            {
                hurricane = new Hurricane(years[i], names[i], months[i], 5, pressures[i], windSpeeds[i] * 1.15078);
            }
            hurricaneList.add(hurricane);
        }
    
        //user prompted for range of years
        Scanner input = new Scanner(System.in);
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        do
        {
            System.out.print("Enter a date range from 1995 to 2019 like (2000-2003): ");
            String range = input.nextLine();
            String year1 = range.substring(0, 4);
            String year2 = range.substring(5, 9);
            x = Integer.parseInt(year1);
            y = Integer.parseInt(year2);
        }
        while (x < 1995 || x > 2019 || y < 1995 || y > 2019 || x > y);
        
        // Get Min, Max, Average
        int min_cat = Integer.MAX_VALUE;
        int max_cat = Integer.MIN_VALUE;
        double total_cat = 0;

        int min_pres = Integer.MAX_VALUE;
        int max_pres = Integer.MIN_VALUE;
        double total_pres = 0;

        double min_speed = Integer.MAX_VALUE;
        double max_speed = Integer.MIN_VALUE;
        double total_speed = 0;

        int count = 0;
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;

        for(Hurricane h: hurricaneList)
        {
            if (h.getYear() >= x && h.getYear() <= y)
            {
                if (h.getCat() < min_cat) min_cat = h.getCat();
                if (h.getCat() > max_cat) max_cat = h.getCat();
                if (h.getPressure() < min_pres) min_pres = h.getPressure();
                if (h.getPressure() > max_pres) max_pres = h.getPressure();
                if (h.getWindspeed() < min_speed) min_speed = h.getWindspeed();
                if (h.getWindspeed() > max_speed) max_speed = h.getWindspeed();
                if (h.getCat() == 1) cat1++;
                if (h.getCat() == 2) cat2++;
                if (h.getCat() == 3) cat3++;
                if (h.getCat() == 4) cat4++;
                if (h.getCat() == 5) cat5++;
                total_cat += h.getCat();
                total_pres += h.getPressure();
                total_speed += h.getWindspeed();
                count++;
            }
        }

        // calc average
        double average_cat = total_cat/count;
        double average_pres = total_pres/count;
        double average_speed = total_speed/count;

        PrintWriter outFile = new PrintWriter(new File("src/hurricaneinfo.txt"));

        // Print header of data
        outFile.printf("%35s %d %s %d \n", "Hurricane", x, "-", y);
        outFile.println();
        outFile.printf("%6s %13s %12s %17s %20s%n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        outFile.println("========================================================================");

        // Print data of each hurrican
        for(Hurricane h: hurricaneList)
        {
            if (h.getYear() >= x && h.getYear() <= y)
            {
                outFile.println(h.toString());
            }
        }
        // Print average max min
        outFile.println("========================================================================");
        outFile.printf("%15s %16.2f %13.2f %16.2f", "Average:", average_cat, average_pres, average_speed);
        outFile.println();
        outFile.printf("%15s %13d %13d %19.2f", "Minimum:", min_cat, min_pres, min_speed);
        outFile.println();
        outFile.printf("%15s %13d %13d %19.2f", "Maximum:", max_cat, max_pres, max_speed);
        outFile.println("\n");

        // Summary of cats
        outFile.println("Summary of Categories:");
        outFile.printf("%9s %2d%n", "Cat 1:", cat1);
        outFile.printf("%9s %2d%n", "Cat 2:", cat2);
        outFile.printf("%9s %2d%n", "Cat 3:", cat3);
        outFile.printf("%9s %2d%n", "Cat 4:", cat4);
        outFile.printf("%9s %2d%n", "Cat 5:", cat5);
        outFile.close();
}}