public class ElectionTesterV1 {
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
            total += people[i].getVotes();
        }
        return total;
    }

    public static void printFullResults(Candidate[] people)
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
}
