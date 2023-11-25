
/**
 * Purpose: To create a catapault class
 *
 * @Tristan Darnell
 * @11/25/23
 *
 */
public class CatapaultStrawberries {
    private int speed;
    private int angle;

    public CatapaultStrawberries(int s, int a)
    {
        speed = s;
        angle = a;
    }

    public double calcDistance()
    {
        // Convert speed to meters/second
        double distance = ((speed * speed) * Math.sin(2 * Math.toRadians(angle))) / (9.8);
        return distance;
    }
}
