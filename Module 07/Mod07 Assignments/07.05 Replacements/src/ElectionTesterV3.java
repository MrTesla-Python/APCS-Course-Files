 /**
 * The ElectionTesterV3 class demonstrations replacing
 * elements within an array.
 *
 * @author Tristan Darnell
 * @version 09/13/23
 */
public class ElectionTesterV3 {
    public static void main(String[] args)
    {
        Candidate2[] people = new Candidate2[5];
        
        people[0] = new Candidate2("Tony Stark", 3691);
        people[1] = new Candidate2("Alex Ham", 2691);
        people[2] = new Candidate2("Aaron Burr", 1962);
        people[3] = new Candidate2("James M", 1491);
        people[4] = new Candidate2("John Adams", 1968);


        printCandidatesResults(people);
        totalVotes(people);
        printFullResults(people);

        changePerson(people, "Alex Ham", "Thomas J");
        System.out.println("<< Changing Alex Ham to Thomas J >>");
        System.out.println();
        printCandidatesResults(people);
        totalVotes(people);
        printFullResults(people);

        changeVotes(people, "Tony Stark", 2500);
        System.out.println("<< Changing Tony Stark votes to 2500 >>");
        System.out.println();
        printCandidatesResults(people);
        totalVotes(people);
        printFullResults(people);

        changeboth(people, 5000, "James M", "Bob");
        System.out.println("<< Changing Tony Stark to Bob and votes to 5000>>");
        System.out.println();
        printCandidatesResults(people);
        totalVotes(people);
        printFullResults(people);

    }
    public static void printCandidatesResults(Candidate2[] people)
    {
        System.out.println(" Raw Election Data:");
        System.out.println();

        for (int i = 0; i < people.length; i++)
        {
            System.out.println(people[i]);
        }
    }

    public static int totalVotes(Candidate2[] people)
    {
        int total = 0;
        for (int i = 0; i < people.length; i++)
        {
            total += people[i].getVotes();
        }
        return total;
    }

    public static void printFullResults(Candidate2[] people)
    {
        System.out.println();
        System.out.println();
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("                 Votes            % of Total");
        System.out.println("Candidate       Recieved            Votes");
        System.out.println("=============================================");
        double total = totalVotes(people);
        for (int i = 0; i < people.length; i++)
        {
            System.out.printf("%-11s %10d %18.2f %n", people[i].getName(), people[i].getVotes(), people[i].getVotes()/total*100);
        }
        System.out.println();
        System.out.printf("The total number of votes is: %.0f%n", total);
    }

    public static void changePerson(Candidate2[] person, String find, String replace)
    {
        for (int i = 0; i < person.length; i++)
        {
            if (person[i].getName().equals(find)) person[i].setName(replace);
        }
    }

    public static void changeVotes(Candidate2[] person, String find, int replace)
    {
        for (int i = 0; i < person.length; i++)
        {
            if (person[i].getName().equals(find)) person[i].setVotes(replace);
        }
    }

    public static void changeboth(Candidate2[] person, int replace, String find1, String replace1)
    {
        for (int i = 0; i < person.length; i++)
        {
            if (person[i].getName().equals(find1))
            {
                person[i].setVotes(replace);
                person[i].setName(replace1);
            }
        }
    }
}
