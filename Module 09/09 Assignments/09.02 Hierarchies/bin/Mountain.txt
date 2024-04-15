
 /**
 * This class defines a basic Mountain.
 *
 * Tristan Darnell
 * 12/24/23
 */

public class Mountain extends Terrain{
    private int numMountains;
    
    public Mountain(int l, int w, int n)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        numMountains = n;
    }

    public int getNumMountains()
    {
        return numMountains;
    }
}
