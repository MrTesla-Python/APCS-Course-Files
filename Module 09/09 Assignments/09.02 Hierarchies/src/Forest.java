
 /**
 * This class defines a basic Forest.
 *
 * Tristan Darnell
 * 12/24/23
 */

public class Forest extends Terrain {
    private int numTrees;
    
    public Forest(int l, int w, int n)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        numTrees = n;
    }

    public int getNumTrees()
    {
        return numTrees;
    }
    
}
