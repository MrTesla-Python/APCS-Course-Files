/**
 * The CarV3 class sets up a Car object that has basic methods, inclued loaded constructors,
 * and overloaded methods, to help make the program more functional, these
 * do things like turn the car on, accelerate and brake. The CarTestorV3 class
 * simply creates a CarV3 object and then performs its various methods, and outputs it 
 * in a neat way.
 *
 * @author Tristan Darnell
 * @version 07/31/23
 */
public class CarV8 {

    private double mySpeed;
    private boolean myEngineOn;
    private String myCar;
    private double myTotalMileage;
    private double myFuelLevel;

    // default constructor

    public CarV8()
    {
        mySpeed = 0;
        myEngineOn = false;
        myCar = null;
        myTotalMileage = 0.0;
        myFuelLevel = 20.0;
    }
    public CarV8(int speed, boolean engineOn, String car, double fuelLevel)
    {
        mySpeed = speed;
        myEngineOn = engineOn;
        myCar = car;
        myTotalMileage = 0.0;
        myFuelLevel = fuelLevel;
    }

    public double accelerate(double increaseSpeed)
    {
        if (myEngineOn)
        {
            mySpeed += increaseSpeed;
            myFuelLevel -= 0.1 * mySpeed;
            myTotalMileage += mySpeed / 60.0;
        }

        return mySpeed;
    }

    public double brakeCar(double decreaseSpeed)
    {
        if (myEngineOn)
        {
            mySpeed -= decreaseSpeed;
        }
        return mySpeed;
    }

    public void startEngine()
    {
        if (!myEngineOn)
        {
            myEngineOn = true;
        }
    }

    public void stopEngine()
    {
        if (myEngineOn)
        {
            myEngineOn = false;
            mySpeed = 0;
        }
    }

    public boolean checkEngineStatus()
    {
        if (myEngineOn)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public double getSpeed()
    {
        return mySpeed;
    }

    public String getCar()
    {
        return myCar;
    }

    public double getMileage()
    {
        return Math.round(myTotalMileage * 100) / 100.0;
    }

    public void refuel(double amountInGallons)
    {
        myFuelLevel += amountInGallons;
    }

    public void refuel(int amountInGallons)
    {
        myFuelLevel += amountInGallons;
    }

    public double getFuelLevel()
    {
        return Math.round(myFuelLevel * 100) / 100.0;
    }

    public void addMake(String make)
    {
        myCar = make;
    }
}
