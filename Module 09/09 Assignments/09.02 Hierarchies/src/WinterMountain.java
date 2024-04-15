
 /**
 * This class defines a basic WinterMountain.
 *
 * Tristan Darnell
 * 12/24/23
 */

public class WinterMountain extends Mountain{
    private double temp;
    
    public WinterMountain(int l, int w, int n, double t)
    {
        // call superclass
        super(l, w, n);

        // initialize instance variables
        temp = t;
    }

    public double getTemp()
    {
        return temp;
    }
}
