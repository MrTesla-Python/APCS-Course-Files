/**
 * The CarV3 class sets up a Car object that has basic methods
* that do things like turn the car on, accelerate and brake. The CarTestorV3 class
 * simply creates a CarV3 object and then performs its various methods, and outputs it 
 * in a neat way.
 *
 * @author Tristan Darnell
 * @version 07/30/23
 */
public class CarTestorV3 
{

    public static void printCarStatus(boolean carOn, double carSpeed)
    {
        System.out.println(" " + carOn + "\t\t\t" + carSpeed);
    }

    public static void main(String[] args)
    {
        CarV3 car1 = new CarV3(0);

        System.out.println(" \t Car Status:");
        boolean carOn = car1.checkEngineStatus();
        double carSpeed = car1.getSpeed();

        System.out.println("Car On\t\t       Speed");

        System.out.println("=============================");

        printCarStatus(carOn, carSpeed);

        car1.startEngine();
        carOn = car1.checkEngineStatus();
        printCarStatus(carOn, carSpeed);

        car1.accelerate(55.5);
        carSpeed = car1.getSpeed();
        printCarStatus(carOn, carSpeed);

        car1.accelerate(3.5);
        carSpeed = car1.getSpeed();
        printCarStatus(carOn, carSpeed);

        car1.brakeCar(25);
        carSpeed = car1.getSpeed();
        printCarStatus(carOn, carSpeed);

        car1.stopEngine();
        carSpeed = car1.getSpeed();
        carOn = car1.checkEngineStatus();
        printCarStatus(carOn, carSpeed);
    }
    
}
