/**
 * The Student.java class creates a student object that has various grades
 * and then calculates average and difference between the grades, and also has a way 
 * to print out the data of a student in a neat way.
 * 
 * @author Tristan Darnell
 * @version  08/03/23
 */
public class StudentTesterV2 {
    public static void main (String [] args) 
    {

        // Create varaibles for the students
        String name1 = "Tristan Darnell";
        double quiz11 = 93;
        double quiz12 = 77;

        String name2 = "Logan Velez";
        double quiz21 = 100;
        double quiz22 = 93;

        String name3 = "Noah Hall";
        double quiz31 = 100;
        double quiz32 = 55;

        // initialzie variable of students
        StudentV2[] students = {new StudentV2(name1, quiz11, quiz12), new StudentV2(name2, quiz21, quiz22), new StudentV2(name3, quiz31, quiz32)};

        // Printint out the outline for how the other stuff will be printed
        System.out.printf("%50s %n", "Quiz Results");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", "Student Name", "Quiz 1 Grade", "Quiz 2 Grade", "Difference", "Average");
        System.out.println("============================================================================================");
       
        // Printing out each student 
        for (StudentV2 s: students)
        {
            System.out.println(s);
        }
    }
}
