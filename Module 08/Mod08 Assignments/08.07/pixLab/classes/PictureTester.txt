/*
 * To test the picture class
 * 
 * Tristan Darnell
 * 12/23/23
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture pic = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/IMG_0339.jpg");
    pic.explore();
    pic.zeroBlue();
    pic.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture pic = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/IMG_0339.jpg");
    pic.explore();
    pic.keepOnlyBlue();
    pic.explore();
  }

  public static void testKeepOnlyGreen()
  {
    Picture pic = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/IMG_0339.jpg");
    pic.explore();
    pic.keepOnlyGreen();
    pic.explore();
  }
  public static void testKeepOnlyRed()
  {
    Picture pic = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/IMG_0339.jpg");
    pic.explore();
    pic.keepOnlyRed();
    pic.explore();
  }
  
  public static void testNegate()
  {
    Picture pic = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/IMG_0339.jpg");
    pic.explore();
    pic.negate();
    pic.explore();
  }

  public static void testGrayscale()
  {
    Picture pic = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/water.jpg");
    pic.explore();
    pic.grayscale();
    pic.explore();
  }

  public static void testFixUnderwater()
  {
    Picture water = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/water.jpg");
    water.explore();
    water.fixUnderWater();
    water.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms()
  {
    Picture temple = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }

  public static void testMirrorGull()
  {
    Picture temple = new Picture("C:/Users/trist/OneDrive/Documents/APCS Course Files/Module 08/Mod08 Assignments/08.07/pixLab/images/seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();

    
    // Activity 8
    //testCollage();
    //testCopy();
    //testMyCollage();
    
    // Activity 9
    //testEdgeDetection();
    //testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












