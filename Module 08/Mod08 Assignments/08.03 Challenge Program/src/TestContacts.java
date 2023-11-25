
/**
 * Purpose: To utlize a Contact object and then use search methods
 *
 * @Tristan Darnell
 * @11/19/23
 *
 */
public class TestContacts
{
    public static void main(String[] args)
    {
        Contacts[] contacts = new Contacts[10];

        contacts[0] = new Contacts("Diana Prince", "aunt", "Oct 25", "321-555-0811", "wonderwoman@theamazon.net");
        contacts[1] = new Contacts("Bruce Wayne", "friend", "Jan 19", "123-456-7890", "batman@wayneenterprises.com");
        contacts[2] = new Contacts("Clark Kent", "colleague", "Apr 12", "555-123-4567", "superman@dailyplanet.com");
        contacts[3] = new Contacts("Barry Allen", "cousin", "Nov 11", "987-654-3210", "flash@centralcity.com");
        contacts[4] = new Contacts("Selina Kyle", "neighbor", "Mar 21", "777-888-9999", "catwoman@meowmail.com");
        contacts[5] = new Contacts("Hal Jordan", "friend", "Aug 30", "555-777-8888", "greenlantern@oa.org");
        contacts[6] = new Contacts("Barbara Gordon", "sister", "Jan 30", "321-987-6543", "oracle@gcpd.gov");
        contacts[7] = new Contacts("Arthur Curry", "coworker", "Dec 02", "234-567-8901", "aquaman@atlantis.net");
        contacts[8] = new Contacts("Oliver Queen", "friend", "May 16", "876-543-2109", "greenarrow@queenindustries.com");
        contacts[9] = new Contacts("Superman", "colleague", "Oct 12", "555-123-4567", "superman@dailyplanet.com");
        printContacts(contacts);

        System.out.println("\n\nSearching for Bruce Wayne: ");
        selectionName(contacts);
        int test = binarySearchName(contacts, "Bruce Wayne");
        if(test != -1)
            System.out.println("Found: " + contacts[test]);
        else
            System.out.println("Not found. " );

        
        System.out.println("\n\nSearching for friend: ");
        selectionRelation(contacts);
        binarySearchRelation(contacts, "friend");

        System.out.println("\n\nSearching for Oct: ");
        findBirthday(contacts, "Oct");

        System.out.println("\n\nSearching for 555-123-4567: ");
        findNumber(contacts, "555-123-4567");

        System.out.println("\n\nSearching for superman@dailyplanet.com: ");
        findEmail(contacts, "superman@dailyplanet.com");

    }

    public static void printContacts(Contacts[] r)
    {
        System.out.println("Name                 Relation w/ me        Birthday            Phone Number         Email");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }

    public static int binarySearchName(Contacts[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getName().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (r[low].getName().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    public static void binarySearchRelation(Contacts[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getRelationMe().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( r[probe].getRelationMe().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (r[low].getRelationMe().compareTo(toFind) == 0 ))
        {
            linearPrintRelation(r, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    // Prints all elements before and after the found element 
    // that match the search criteria for location.
    public static void linearPrintRelation(Contacts[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getRelationMe().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getRelationMe().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void findBirthday(Contacts[] r, String toFind)
    {
        toFind = toFind.substring(0, 3);
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getBirthday().compareTo(toFind) == 0)
            {
                System.out.println(r[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the contacts");
        }
    }

    public static void findNumber(Contacts[] r, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getPhoneNumber().compareTo(toFind) == 0)
            {
                System.out.println(r[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the contacts");
        }
    }

    public static void findEmail(Contacts[] r, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < r.length; i++)
        {
            if(r[i].getEmail().compareTo(toFind) == 0)
            {
                System.out.println(r[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the Contacts");
        }
    }

    // Sorts Name using selections sort
    public static void selectionName(Contacts[] source)
    {
        int i;
        int k;
        int posMax;
        Contacts temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getName().compareTo(source[posMax].getName()) > 0 )
                    posMax = k;
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
    
        }
        //for (int j = 0; j < source.length; j++)
        //{
            //System.out.println(source[j]);
        //}
    }

    // Sorts RelationMe using selections sort
    public static void selectionRelation(Contacts[] source)
    {
        int i;
        int k;
        int posMax;
        Contacts temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getRelationMe().compareTo(source[posMax].getRelationMe()) > 0 )
                    posMax = k;
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
    
        }
    }
}