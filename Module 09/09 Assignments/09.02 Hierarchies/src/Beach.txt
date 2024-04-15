
 /**
 * This class defines a basic Beach.
 *
 * Tristan Darnell
 * 12/24/23
 */

public class Beach extends Terrain{
    private int numShells;
    public Beach(int l, int w, int n)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        numShells = n;
    }

    public int getNumShells()
    {
        return numShells;
    }
    
}
