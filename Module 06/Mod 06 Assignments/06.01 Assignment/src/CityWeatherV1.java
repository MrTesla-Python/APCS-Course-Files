/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV1 {
    // private instance variables - three arrays
    private String[] myMonths;
    private double[] myTemperature; 
    private double[] myPrecipitation;

    // constructor with parameters
    public CityWeatherV1(String[] months, double[] temperature, double[] precipitation)
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
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}
