
 /**
 * This tests various classes.
 *
 * Tristan Darnell
 * 12/24/23
 */

public class GameTerrainTester {
    public static void main(String[] args)
    {
        Terrain one = new Terrain(150, 240);
        Forest two = new Forest(400, 400, 180);
        Mountain three = new Mountain(500, 500, 12);
        WinterMountain four = new WinterMountain(500, 500, 30, 12.34);
        Beach five = new Beach(1000, 1000, 50);
        RainForest six = new RainForest(500, 500, 100, 14.5);

        System.out.println(one.getTerrainSize());
        System.out.println("Forest " + two.getTerrainSize() + " and has " + two.getNumTrees() + " trees");
        System.out.println("Mountain " + three.getTerrainSize() + " and has " + three.getNumMountains() + " mountains");
        System.out.println("Winter Mountain " + four.getTerrainSize() + " and has " + four.getNumMountains() + " mountains and temperature " + four.getTemp() + " degrees");
        System.out.println("Beach " + five.getTerrainSize() + " and has " + five.getNumShells() + " shells");
        System.out.println("Rain Forest " + six.getTerrainSize() + " and has " + six.getNumTrees() + " mountains and rain fall of " + six.getInchesRain() + " inches");
    }

}
