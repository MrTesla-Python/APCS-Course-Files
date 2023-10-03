 /**
 * The Grade Tester creates a Student object
 * then uses various methods to insert and delete
 * various elements
 *
 * @author Tristan Darnell
 * @version 09/18/23
 */
import java.util.*;
public class GradeTester {

    public static void main(String[] args)
    {
        List<Student2> classroom = new ArrayList<Student2>();
        classroom.add(new Student2 ("Gavin Velez", 55, 65, 75, 90, 80));
        classroom.add(new Student2 ("Logan Van", 75, 73, 85, 90, 100));
        classroom.add(new Student2 ("John Dauns", 20, 10, 15, 13, 15));
        classroom.add(new Student2 ("Bob Lee", 80, 83, 82, 86, 80));
        classroom.add(new Student2 ("Joe Doe", 100, 100, 95, 90, 96));

        System.out.println("Starting Gradebook:");
        System.out.println();
        traverse(classroom);

        System.out.println();
        replaceStudent(classroom, "Gavin Velez", "Dylan Oliver");
        System.out.println("<<Replacing Gavin Velez with Dylan Oliver>>");
        System.out.println();
        traverse(classroom);

        System.out.println();
        replaceGrade(classroom, "Dylan Oliver", 1, 100);
        System.out.println("<<Repalcing Dylan Olvier's 1st quiz with a 100>>");
        System.out.println();
        traverse(classroom);

        System.out.println();
        replaceFullStudent(classroom, "Dylan Oliver", "Peter Santos", 50, 75, 95, 66, 73);
        System.out.println("<<Repalcing Dylan Oliver with Peter Santos and adjusting grades accordingly>>");
        System.out.println();
        traverse(classroom);

        System.out.println();
        insertStudent(classroom, "Logan Van", "Alex Ham", 100, 100, 100, 100, 100);
        System.out.println("<<Adding Alex Ham before Logan Van>>");
        System.out.println();
        traverse(classroom);

        System.out.println();
        deleteStudent(classroom, "Bob Lee");
        System.out.println("<<Deleting Bob Lee>>");
        System.out.println();
        traverse(classroom);
    }

    public static void traverse(List<Student2> classroom)
    {
        System.out.printf("%-13s %7s %7s %7s %7s %7s%n", "Student name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("-------------------------------------------------------");
        for (Student2 student : classroom)
        {
            System.out.printf("%-13s %7s %7s %7s %7s %7s%n", student.getName(), student.getQuiz(1), student.getQuiz(2), student.getQuiz(3), student.getQuiz(4), student.getQuiz(5));
        }
    }

    public static void replaceStudent(List<Student2> classroom, String find, String replace)
    {
        for (int index = 0; index < classroom.size(); index++)
        {
            if (classroom.get(index).getName().equals(find)) classroom.get(index).setName(replace);
        }
    }
    public static void replaceGrade(List<Student2> classroom, String student, int find, int replace)
    {
        for (int index = 0; index < classroom.size(); index++)
        {
            if (classroom.get(index).getName().equals(student)) classroom.get(index).setQuiz(find, replace);
        }
    }
    
    public static void replaceFullStudent(List<Student2> classroom, String student, String replace, int Q1, int Q2, int Q3, int Q4, int Q5)
    {
        for (int index = 0; index < classroom.size(); index++)
        {
            if (classroom.get(index).getName().equals(student)) classroom.set(index, new Student2(replace, Q1, Q2, Q3, Q4, Q5));
        }
    }

    public static void insertStudent(List<Student2> classroom, String student, String replace, int Q1, int Q2, int Q3, int Q4, int Q5)
    {
        for (int index = 0; index < classroom.size(); index++)
        {
            Student2 currentStudent = classroom.get(index);
            if (currentStudent.getName().equals(student)) 
            {
                classroom.add(index, new Student2(replace, Q1, Q2, Q3, Q4, Q5));
                break;
            }
        }
    }

    public static void deleteStudent(List<Student2> classroom, String find)
    {
        for (int index = 0; index < classroom.size(); index++)
        {
            if (classroom.get(index).getName().equals(find)) classroom.remove(index);
        }
    }
}
