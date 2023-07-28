/**
 * The PlanetGravity class, takes data about a planet, and then has three Methods
 * one that calculates the gravity and two that help print and format all the information neatly.
 *
 * @author Tristan Darnell
 * @version 07/27/23
 */
public class PlanetGravity {

    public static double gravity(double diameter, double mass)
    {
        diameter *= 1000;
        diameter /= 2;
        double gravity = (6.67e-11 * mass) / Math.pow(diameter, 2);
        gravity = Math.round(gravity * 100.0) / 100.0;
        return gravity;

    }

    public static void title()
    {
        System.out.println("\t\t\tPlanetary Data");
        System.out.println("  Planet \t Diameter (km) \t Mass (kg) \t g (m/s^2)");
        System.out.println("-----------------------------------------------------------");
    }

    public static void planetInfo(String planet, double diameter, double mass, double gravity)
    {
        System.out.println("  " + planet + " \t " + diameter  + " \t " + mass + " \t " + gravity);
    }
    public static void main(String[] args) throws Exception {
        String planet = "Uranus";
        double diameter = 51118;
        double mass = 8.683e25;
        double gravity = (gravity(diameter, mass));
        title();
        planetInfo(planet, diameter, mass, gravity);
    }
}
