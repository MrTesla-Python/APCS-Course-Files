/**
 * The Student.java class creates a student object that has various grades
 * and then calculates average and difference between the grades, and also has a way 
 * to print out the data of a student in a neat way.
 * 
 * @author Tristan Darnell
 * @version  08/03/23
 */

// Create student class
public class StudentV2 
{
    // initilize variables
    private String myName;
    private double myQuiz1;
    private double myQuiz2;

    // create constructor
    public StudentV2(String name, double quiz1, double quiz2)
    {
        myName = name;
        myQuiz1 = quiz1;
        myQuiz2 = quiz2;
    }

    // Calculates the average between two grades
    public double calcAverage(double quiz1, double quiz2)
    {
        return (quiz1 + quiz2) / 2.0;
    }

    // Calculates the difference between two grades
    public double calcDifference(double quiz1, double quiz2)
    {
        return (quiz1 - quiz2);
    }

    // Formats data neatly
    public String toString()
    {
        return String.format("%-20s %-20.0f %-20.0f %-20.2f %-20.2f", myName, myQuiz1, myQuiz2, calcDifference(myQuiz1, myQuiz2), calcAverage(myQuiz1, myQuiz2));
    }
}
