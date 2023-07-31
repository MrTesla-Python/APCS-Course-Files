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
public class CarTestorV8 
{

    public static void printCarStatus(String car, boolean carOn, double carSpeed, double mileage, double fuel)
    {
        System.out.println(" " + car + "\t\t" + carSpeed + "\t\t" + carOn + "\t\t\t" + mileage + "\t\t" + fuel);
    }

    public static void main(String[] args)
    {
        CarV8 car1 = new CarV8();
        CarV8 car2 = new CarV8(50, true, "Camry", 15.5);

        System.out.println(" \t\t\t\t\t Car Status:");
        System.out.println(" Make\t\tSpeed\t\tEngine Status\t\tmileage\t\tfuel");
        System.out.println("=============================================================================");

        String make1 = car1.getCar();
        double carSpeed1 = car1.getSpeed();
        boolean carOn1 = car1.checkEngineStatus();
        double mileage1 = car1.getMileage();
        double fuel1 = car1.getFuelLevel();

        car1.addMake("Lambo");
        make1 = car1.getCar();

        printCarStatus(make1, carOn1, carSpeed1, mileage1, fuel1);

        car1.startEngine();
        car1.accelerate(50);
        carSpeed1 = car1.getSpeed();
        carOn1 = car1.checkEngineStatus();
        mileage1 = car1.getMileage();
        fuel1 = car1.getFuelLevel();

        printCarStatus(make1, carOn1, carSpeed1, mileage1, fuel1);

        car1.refuel(5);
        fuel1 = car1.getFuelLevel();

        printCarStatus(make1, carOn1, carSpeed1, mileage1, fuel1);


        printCarStatus(make1, carOn1, carSpeed1, mileage1, fuel1);

        car1.brakeCar(50);
        carSpeed1 = car1.getSpeed();
        printCarStatus(make1, carOn1, carSpeed1, mileage1, fuel1);

        car1.stopEngine();
        carOn1 = car1.checkEngineStatus();
        printCarStatus(make1, carOn1, carSpeed1, mileage1, fuel1);

        car1.refuel(5.57);
        fuel1 = car1.getFuelLevel();
        printCarStatus(make1, carOn1, carSpeed1, mileage1, fuel1);


        String make2 = car2.getCar();
        double carSpeed2 = car2.getSpeed();
        boolean carOn2 = car2.checkEngineStatus();
        double mileage2 = car2.getMileage();
        double fuel2 = car2.getFuelLevel();
        printCarStatus(make2, carOn2, carSpeed2, mileage2, fuel2);

        car2.accelerate(100);
        carSpeed2 = car2.getSpeed();
        carOn2 = car2.checkEngineStatus();
        mileage2 = car2.getMileage();
        fuel2 = car2.getFuelLevel();
        printCarStatus(make2, carOn2, carSpeed2, mileage2, fuel2);

        car2.brakeCar(150);
        car2.stopEngine();
        car2.refuel(25);

        carOn2 = car2.checkEngineStatus();
        carSpeed2 = car2.getSpeed();
        fuel2 = car2.getFuelLevel();
        printCarStatus(make2, carOn2, carSpeed2, mileage2, fuel2);
    }
    
}
