/**
 * The CityWeatherV2 class sets up a weather object that has various
 * weather information about a city and respective getter and setter methods, and some
 * conversion methods. The CityWeatherTesterV2 creates a CityWeatherV2 object and
 * then prints it in a organized fashion.
 * 
 * @author Tristan Darnell
 * @version  08/02/23
 */
public class CityWeatherV2 {
    // private instance variables - three arrays
    private String[] myMonths;
    private double[] myTemperature; 
    private double[] myPrecipitation;

    // constructor with parameters
    public CityWeatherV2(String[] months, double[] temperature, double[] precipitation)
    {
        myMonths = months;
        myTemperature = temperature;
        myPrecipitation = precipitation;
    }
    // setters and getters for each private instance variable
    public void setMonth(String[] newMonths)
    {
        myMonths = newMonths;
    }

    public void setTemperature(double[] newTemperature)
    {
        myTemperature = newTemperature;
    }

    public void setPrecipitation(double[] newPrecipitation)
    {
        myPrecipitation = newPrecipitation;
    }

    // method to calculate the average of temperature
    public double averageTemp()
    {
        double average;
        double total = 0;
        for (int i = 0; i < myTemperature.length; i++)
        {
            total += myTemperature[i];
        }

        average = total / myTemperature.length;
        return average;
    }
      
    // method to calculate total precipitation array
    public double totalPrecipitation()
    {
        double total = 0;
        for (int i = 0; i < myPrecipitation.length; i++)
        {
            total += myPrecipitation[i];
        }
        return total;
    }
   
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    public double convertToCelsius(int currIndex)
    {
        double ans = ((myTemperature[currIndex] - 32) * 5.0) / 9.0;
        return ans;
    }
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02
    public double convertToCentimenters(int currIndex)
    {
        double ans = myPrecipitation[currIndex] * 2.54;
        return ans;
    }

}
