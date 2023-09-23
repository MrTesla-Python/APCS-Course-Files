 /**
 * The ElectionTesterV8 class demonstrates deleting and inserting
 * elements within an array list.
 *
 * @author Tristan Darnell
 * @version 09/13/23
 */
import java.util.*;
public class ElectionTesterV8 {
    public static void main(String[] args)
    {
        List<Candidate2> people = new ArrayList<Candidate2>();
        
        people.add(new Candidate2("Tony Stark", 3691));
        people.add(new Candidate2("Alex Ham", 2691));
        people.add(new Candidate2("Aaron Burr", 1962));
        people.add(new Candidate2("James M", 1491));
        people.add(new Candidate2("John Adams", 1968));


        printCandidatesResults(people);
        totalVotes(people);
        printFullResults(people);

        System.out.println();
        insertPerson1(people, 2, "Nick Fury", 518);
        System.out.println("<<In position 2, add Nick Fury, 518 votes>>");
        printFullResults(people);

        System.out.println();
        insertPerson2(people, "James M", "Clint B", 426);
        System.out.print("<<<<Before James M, add Clint B, 426 votes>>");
        printFullResults(people);
    }
    public static void printCandidatesResults(List<Candidate2> people)
    {
        System.out.println(" Raw Election Data:");
        System.out.println();

        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }
    }

    public static int totalVotes(List<Candidate2> people)
    {
        int total = 0;
        for (int index = 0; index < people.size(); index++)
        {
            if (people.get(index) != null)
            total += people.get(index).getVotes();
        }
        return total;
    }

    public static void printFullResults(List<Candidate2> people)
    {
        System.out.println();
        System.out.println();
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("                 Votes            % of Total");
        System.out.println("Candidate       Recieved            Votes");
        System.out.println("=============================================");
        double total = totalVotes(people);
        for (int index = 0; index < people.size(); index++)
        {
            if (people.get(index) != null)
            System.out.printf("%-11s %10d %18.2f %n", people.get(index).getName(), people.get(index).getVotes(), people.get(index).getVotes()/total*100);
        }
        System.out.println();
        System.out.printf("The total number of votes is: %.0f%n", total);
    }
    public static void insertPerson1(List<Candidate2> people, int location, String addN, int addS)
    {
        // insert item into ArrayList
        people.add(location, new Candidate2(addN, addS));
    }

    public static void insertPerson2(List<Candidate2> people, String find, String addN, int addS)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < people.size(); index++)
            if(people.get(index).getName().equals(find))
                location = index;

        // insert item into ArrayList
        people.add(location, new Candidate2(addN, addS));
    }

    public static void delete1(List<Candidate2> people, int location)
    {
        people.remove(location);
    }

    public static void delete2(List<Candidate2> people, String find)
    {
        int location = 0;
        int index;

        for (index = 0; index < people.size(); index++)
        {
            if (people.get(index).getName().equals(find))
            {
                location = index;
                break;
            }
        }
        if (index != people.size()) people.remove(location);
    }
}