
/**
 * Purpose: To test various angles and speeds using a catapault class
 *
 * @Tristan Darnell
 * @11/25/23
 *
 */
public class TestCatapault
{
    public static void main(String[] args)
    {
        int [] speedArray = {20, 25, 30, 35, 40, 45, 50};
        int[] angleArray = {25, 30, 35, 40, 45, 50};
        double[][] twoDimArray = new double[6][7];

        for (int row = 0; row < angleArray.length; row++)
        {
            for (int col = 0; col < speedArray.length; col++)
            {
                CatapaultStrawberries create = new CatapaultStrawberries(speedArray[col], angleArray[row]);
                twoDimArray[row][col] = create.calcDistance();
            }
        }
        System.out.println("                     Projectile Distance (feet)                     ");
        System.out.println("MPH    25 Deg    30 Deg    35 Deg   40 Deg    45 Deg    50 Deg    55 Deg   ");
        System.out.println();
        System.out.println("=========================================================================");

        for (int row = 0; row < angleArray.length; row++)
        {
            System.out.print(speedArray[row]);
            for (int col = 0; col < speedArray.length; col++)
            {
                System.out.printf("%10.2f", twoDimArray[row][col]);
            }
            System.out.println();
        }
    }
}