 /**
 * Creates a student object to use in the tester class
 *
 * @author Tristan Darnell
 * @version 09/18/23
 */
public class Student2 
{
    private String student;
    private int Q1;
    private int Q2;
    private int Q3;
    private int Q4;
    private int Q5;

    public Student2(String student, int Q1, int Q2, int Q3, int Q4, int Q5)
    {
        this.student = student;
        this.Q1 = Q1;
        this.Q2 = Q2;
        this.Q3 = Q3;
        this.Q4 = Q4;
        this.Q5 = Q5;
    }

    public int getQuiz(int quizNumber)
    {
        if (quizNumber == 1) return Q1;
        else if (quizNumber == 2) return Q2;
        else if (quizNumber == 3) return Q3;
        else if (quizNumber == 4) return Q4;
        else return Q5;
    }

    public void setQuiz(int quizNumber, int newGrade)
    {
        if (quizNumber == 1) Q1 = newGrade;
        else if (quizNumber == 2) Q2 = newGrade;
        else if (quizNumber == 3) Q3 = newGrade;
        else if (quizNumber == 4) Q4 = newGrade;
        else Q5 = newGrade;
    }

    public String getName()
    {
        return student;
    }

    public void setName(String newStudent)
    {
        student = newStudent;
    }

    public String toString()
    {
        return student + ": " + Q1 + ", " + Q2 + ", " + Q3 + ", " + Q4 + ", " + Q5;
    }
}
