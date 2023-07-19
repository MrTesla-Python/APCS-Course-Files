/**
 * The GradesV2 class essentially gets a new grade declared as an int,
 * add that grade to totalPoints, then calculate average then print all
 * this data on a new line
 *  
 * @ Tristan Darnell
 * @ 19 July 2023
 */
public class GradesV2 {
    public static void main(String[] args) throws Exception {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade

        // Calculate with new grade
        numTests++;
        testGrade = 95;
        totalPoints += testGrade;
        average = (double) totalPoints / (double) numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + 
        " Total Points: " + totalPoints + " Average Score: " + average);

        // Calculate with new grade
        numTests++;
        testGrade = 73;
        totalPoints += testGrade;
        average = (double) totalPoints / (double) numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + 
        " Total Points: " + totalPoints + " Average Score: " + average);

        // Calculate with new grade
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average = (double) totalPoints / (double) numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + 
        " Total Points: " + totalPoints + " Average Score: " + average);

        // Calculate with new grade
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average = (double) totalPoints / (double) numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + 
        " Total Points: " + totalPoints + " Average Score: " + average);

        // Calculate with new grade
        numTests++;
        testGrade = 100;
        totalPoints += testGrade;
        average = (double) totalPoints / (double) numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + 
        " Total Points: " + totalPoints + " Average Score: " + average);

        // Calculate with new grade
        numTests++;
        testGrade = 45;
        totalPoints += testGrade;
        average = (double) totalPoints / (double) numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + 
        " Total Points: " + totalPoints + " Average Score: " + average);

        // Calculate with new grade
        numTests++;
        testGrade = 0;
        totalPoints += testGrade;
        average = (double) totalPoints / (double) numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + 
        " Total Points: " + totalPoints + " Average Score: " + average);

        // Calculate with new grade
        numTests++;
        testGrade = 75;
        totalPoints += testGrade;
        average = (double) totalPoints / (double) numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + 
        " Total Points: " + totalPoints + " Average Score: " + average);

        // Calculate with new grade
        numTests++;
        testGrade = 65;
        totalPoints += testGrade;
        average = (double) totalPoints / (double) numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + 
        " Total Points: " + totalPoints + " Average Score: " + average);


    }
}
