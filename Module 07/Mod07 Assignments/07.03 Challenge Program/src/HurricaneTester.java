/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 *
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
        File fileName = new File("hurricanedata.txt");
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
                hurricane = new Hurricane(years[i], names[i], months[i], 1, pressures[i], windSpeeds[i]);
            }

            else if (windSpeeds[i] * 1.15078 <= 110)
            {
                hurricane = new Hurricane(years[i], names[i], months[i], 2, pressures[i], windSpeeds[i]);
            }

            else if (windSpeeds[i] * 1.15078 <= 129)
            {
                hurricane = new Hurricane(years[i], names[i], months[i], 3, pressures[i], windSpeeds[i]);
            }

            else if (windSpeeds[i] * 1.15078 <= 156)
            {
                hurricane = new Hurricane(years[i], names[i], months[i], 4, pressures[i], windSpeeds[i]);
            }

            else
            {
                hurricane = new Hurricane(years[i], names[i], months[i], 5, pressures[i], windSpeeds[i]);
            }
        }
    
        //user prompted for range of years
        Scanner input = new Scanner(System.in);
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        do
        {
            System.out.print("Enter a date range from 1995 to 2019 like (2000-2003): ");
            String range = input.nextLine();
            String year1 = range.substring(0, 4);
            String year2 = range.substring(5, 9);
            i = Integer.parseInt(year1);
            j = Integer.parseInt(year2);
        }
        while (i < 1995 || i > 2019 || j <)
        
        //print the data
     }
}