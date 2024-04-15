/**
 * This class defines a Rectangular Pyramid object
 *
 * @Tristan Darnell
 * @12/25/23
 */
public class RectangularPyramid4 extends Box4{
    public RectangularPyramid4(int l, int w, int h)
    {
        super(l, w, h);
    }

    public String toString()
    {
        return "Rectangular Pyramid - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
    public boolean equals(RectangularPyramid4 rect)
    {
        if (rect.getLength() != this.getLength()) return false;
        if (rect.getWidth() != this.getWidth()) return false;
        if (rect.getHeight() != this.getHeight()) return false;
        return true;
    }
}
