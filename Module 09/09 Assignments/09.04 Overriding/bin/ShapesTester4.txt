
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @Tristan Darnell
 * @12/25/23
 */
import java.util.*;
public class ShapesTester4
{
    public static void main(String []args)
    {
        Rectangle4 one = new Rectangle4(5, 20);
        Box4 two = new Box4(4, 10, 5);
        Cube4 three = new Cube4(5, 5, 5);
        Parallelogram4 four = new Parallelogram4(5, 5);
        RectangularPyramid4 five = new RectangularPyramid4(18, 5, 1);
        Box4 six = new Box4(5, 5, 5);


        //Print all shapes

        System.out.println("My shapes: ");
        System.out.println();
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( one );
        shapes.add( two );
        shapes.add( three );
        shapes.add( four );
        shapes.add( five );
        shapes.add( six );

        for(Rectangle4 rect: shapes)
        {
        	showEffectBoth(rect);
        }

        System.out.println();
        System.out.println("Test for equality:");

        for(int i = 0; i < 6; i++)
        {
        	for (int j = i; j < 6; j++)
            {
                checkEquals(shapes.get(i), shapes.get(j));
            }
        }
        
        
    }

    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }

    public static void checkEquals(Rectangle4 one, Rectangle4 two)
    {
        if (one.equals(two))
        {
            System.out.println(one + " IS same size as " + two);
        }
        else
        {
            System.out.println(one + " is NOT the same size as " + two);
        }
    }

}
