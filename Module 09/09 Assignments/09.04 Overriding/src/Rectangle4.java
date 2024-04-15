
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @Tristan Darnell
 * @12/25/23
 */
public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.
    
    public String toString()
    {
        return "Rectangle - " + length + " X " + width;
    }
    
    public boolean equals(Rectangle4 rect)
    {
        if (rect.getLength() != this.getLength()) return false;
        if (rect.getWidth() != this.getWidth()) return false;
        return true;
    }
}
