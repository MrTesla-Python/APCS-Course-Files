
 /**
 * This class defines a basic RainForest.
 *
 * Tristan Darnell
 * 12/24/23
 */

public class RainForest extends Forest{
    private double inchesRain;
    
    public RainForest(int l, int w, int n, double r)
    {
        // call superclass
        super(l, w, n);

        // initialize instance variables
        inchesRain = r;
    }

    public double getInchesRain()
    {
        return inchesRain;
    }
    
}
