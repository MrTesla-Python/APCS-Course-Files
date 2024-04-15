/**
 * This class defines a cube object
 *
 * @Tristan Darnell
 * @12/25/23
 */
public class Cube4 extends Box4{
    public Cube4(int l, int w, int h)
    {
        super(l, w, h);
    }

    public String toString()
    {
        return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }  
}
