 /**
 * The ElectionTesterV4 class demonstrations replacing
 * elements within an array list.
 *
 * @author Tristan Darnell
 * @version 09/13/23
 */
import java.util.*;
public class ElectionTesterV4new {
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
            System.out.printf("%-11s %10d %18.2f %n", people.get(index).getName(), people.get(index).getVotes(), people.get(index).getVotes()/total*100);
        }
        System.out.println();
        System.out.printf("The total number of votes is: %.0f%n", total);
    }
}