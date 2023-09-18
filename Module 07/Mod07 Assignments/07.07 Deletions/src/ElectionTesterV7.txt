 /**
 * The ElectionTesterV7 class demonstrates deleting and inserting
 * elements within an array.
 *
 * @author Tristan Darnell
 * @version 09/13/23
 */
public class ElectionTesterV7 {
    public static void main(String[] args)
    {
        Candidate[] people = new Candidate[5];
        
        people[0] = new Candidate("Tony Stark", 3691);
        people[1] = new Candidate("Alex Ham", 2691);
        people[2] = new Candidate("Aaron Burr", 1962);
        people[3] = new Candidate("James M", 1491);
        people[4] = new Candidate("John Adams", 1968);


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

        System.out.println();
        delete1(people, 2);
        System.out.println("<<Delete position 2>>");
        printFullResults(people);

        System.out.println();
        delete2(people, "John Adams");
        System.out.println("<<Delete John Adams>>");
        printFullResults(people);

    }
    public static void printCandidatesResults(Candidate[] people)
    {
        System.out.println(" Raw Election Data:");
        System.out.println();

        for (int i = 0; i < people.length; i++)
        {
            System.out.println(people[i]);
        }
    }

    public static int totalVotes(Candidate[] people)
    {
        int total = 0;
        for (int i = 0; i < people.length; i++)
        {
            if (people[i] != null) total += people[i].getVotes();
        }
        return total;
    }

    public static void printFullResults(Candidate[] people)
    {
        System.out.println();
        System.out.println();
        System.out.println(" Election Results:");
        System.out.println();
        System.out.println("                 Votes            % of Total");
        System.out.println("Candidate       Recieved            Votes");
        System.out.println("=============================================");
        double total = totalVotes(people);
        for (int i = 0; i < people.length; i++)
        {
            if (people[i] != null)
            System.out.printf("%-11s %10d %18.2f %n", people[i].getName(), people[i].getVotes(), people[i].getVotes()/total*100);
        }
        System.out.println();
        System.out.printf("The total number of votes is: %.0f%n", total);
    }

    public static void changePerson(Candidate[] person, String find, String replace)
    {
        for (int i = 0; i < person.length; i++)
        {
            if (person[i].getName().equals(find)) person[i].setName(replace);
        }
    }

    public static void changeVotes(Candidate[] person, String find, int replace)
    {
        for (int i = 0; i < person.length; i++)
        {
            if (person[i].getName().equals(find)) person[i].setVotes(replace);
        }
    }

    public static void changeboth(Candidate[] person, int replace, String find1, String replace1)
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

    public static void insertPerson1(Candidate[] people, int location, String addN, int addS)
    {
       //move items down in the array - last item is lost
       for(int index = people.length - 1; index > location; index--)
           people[index] = people[index-1];

       people[location] = new Candidate(addN, addS);
    }

    public static void insertPerson2(Candidate[] people, String find, String addN, int addS)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < people.length; index++)
            if(people[index].getName().equals(find))
                location = index;

        //move items down in the array - last item is lost
        for(int index = people.length - 1; index > location; index--)
            people[index] = people[index-1];

        people[location] = new Candidate(addN, addS);
    }

    public static void delete1(Candidate[] people, int location)
    {
        if ((location > 0) && (location < people.length))
        {
            for (int index = location; index < people.length - 1; index++)
            {
                people[index] = people[index + 1];
            }
            people[people.length-1] = null;
        }

    }

    public static void delete2(Candidate[] people, String find)
    {
        int location = 0;
        int index;

        for (index = 0; index < people.length; index++)
        {
            if ((people[index] != null) && (people[index].getName().equals(find)))
            {
                location = index;
                break;
            }
            else if (people[index] == null)
            {
                location = -1;
                break;
            }
        }

        if ((index != people.length) && (location >= 0))
        {
            for (index = location; index < people.length - 1; index++)
            {
                people[index] = people[index + 1];
            }
            people[people.length-1] = null;
        }
    }
}
