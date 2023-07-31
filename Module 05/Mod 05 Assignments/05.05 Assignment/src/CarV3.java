/**
 * The CarV3 class sets up a Car object that has basic methods
* that do things like turn the car on, accelerate and brake. The CarTestorV3 class
 * simply creates a CarV3 object and then performs its various methods, and outputs it 
 * in a neat way.
 *
 * @author Tristan Darnell
 * @version 07/30/23
 */
public class CarV3 {

    double mySpeed;
    boolean myEngineOn;
    

    // default constructor
    public CarV3(int speed)
    {
        mySpeed = speed;
        myEngineOn = false;
    }

    public double accelerate(double increaseSpeed)
    {
        if (myEngineOn)
        {
            mySpeed += increaseSpeed;
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
}
