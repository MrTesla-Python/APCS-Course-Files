/**
 * The CityWeatherV2 class sets up a weather object that has various
 * weather information about a city and respective getter and setter methods, and some
 * conversion methods. The CityWeatherTesterV2 creates a CityWeatherV2 object and
 * then prints it in a organized fashion.
 * 
 * @author Tristan Darnell
 * @version  08/02/23
 */
import java.util.Scanner;
public class CityWeatherTesterV2
{
    
   
    
    // method to print results (formatting output will be done in 6.02)
    public static void printResults(String city, String state, String tempLabel, String precipLabel, String[] months, double[] temperature, double[] precipitation, double average, double total)
    {
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
            System.out.printf("%-15s %-15.1f %-15.1f \n", months[index] + ".", temperature[index], precipitation[index]);
        }
        System.out.println("***************************************************");
        System.out.printf("%15s %.1f %15s %.1f", "Average:", average, "Annual:", total);
    }    
        
   
    
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Orlando";  //choose a city from the table provided
        String state = "Florida";  //choose a city from the table provided
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};     //complete initialization of months array
        double [] temperature = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};     //complete initialization of temperatures array
        double [] precipitation = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};     //complete initialization of precipitation array
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
        
        //instantiate CityWeatherV1 object 
        CityWeatherV2 orlando = new CityWeatherV2(month, temperature, precipitation);
        
        //print average temperature and total precipitation
        //double averageTemp = orlando.averageTemp();
        //double totalPrecipitation = orlando.totalPrecipitation();
        //System.out.println("The average temp is " + averageTemp);
        //System.out.println("The total precipitation is " + totalPrecipitation);
        
              

        //input to decide F/C and in/cm - to be completed in 6.02
        System.out.print("Choose the temperature scale (F = Farenheit, C = Celsius): ");
        String temp = in.next();
        in.nextLine();
        System.out.print("Choose the precipitation scale (i = inches, c = centimeters): ");
        String prec = in.next();
        in.nextLine();
        
        //conditions & method call to convert temp, if needed - to be completed in 6.02
        if (temp.equalsIgnoreCase("c"))
        {
            for (int i = 0; i < temperature.length; i++)
            {
                temperature[i] = orlando.convertToCelsius(i);
            }
            orlando.setTemperature(temperature);
        }
        
        //conditions & method call to convert prec, if needed - to be completed in 6.02
        if (prec.equalsIgnoreCase("c"))
        {
            for (int i = 0; i < precipitation.length; i++)
            {
                precipitation[i] = orlando.convertToCentimenters(i);
            }
            orlando.setPrecipitation(precipitation);
        }
        
        //method call to calculate the average temperature
        double averageTemp = orlando.averageTemp();
        
        //method call to calculate the total precipitation
        double totalPrecipitation = orlando.totalPrecipitation();
        
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
        printResults(city, state, tempLabel, precipLabel, month, temperature, precipitation, averageTemp, totalPrecipitation);
    
    
    


    }//end main
}//end class

