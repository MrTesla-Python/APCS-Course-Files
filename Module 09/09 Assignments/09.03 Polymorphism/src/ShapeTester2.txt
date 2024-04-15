import java.util.*;
public class ShapeTester2 {

    public static void polyMorph(Circle2 c)
    {
        System.out.println(c.getCenter());
    }
    public static void main(String[] args)
    {
        Circle2 one =  new Circle2(2, 4, 6);
        Cylinder2 two = new Cylinder2 (10, 15, 3, 4);
        Oval2 three =  new Oval2(25, 10, 4, 7);
        OvalCylinder2 four =  new OvalCylinder2(40, 10, 3, 7, 10);

        ArrayList<Circle2> shapes = new ArrayList<Circle2>();
        shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapes.add(four);
        for (int i = 0; i < shapes.size(); i++)
        {
            polyMorph(shapes.get(i));
        }
    }
}
