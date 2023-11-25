public class TestMusic2 {
    public static void main (String[] args)
    {
        Music2[] musicArray = {
            new Music2("Livin' on a Prayer", 1986, "Bon Jovi"),
            new Music2("Take on Me", 1985, "A-ha"),
            new Music2("Billie Jean", 1983, "Michael Jackson"),
            new Music2("Sweet Child o' Mine", 1987, "Guns N' Roses"),
            new Music2("Like a Virgin", 1984, "Madonna"),
            new Music2("Every Breath You Take", 1983, "The Police"),
            new Music2("Beat It", 1983, "Michael Jackson"),
            new Music2("Sweet Child o' Mine", 1987, "Guns N' Roses"),
            new Music2("Blinding Lights", 2020, "The Weekend"),
            new Music2("With or Without You", 1987, "U2")
    };
    printPlaylist(musicArray);

    System.out.println("\n\nSearching for Beat It: ");
    selectionTitle(musicArray);
    int test = binarySearchTitle(musicArray, "Beat It");
    if(test != -1)
            System.out.println("Found: " + musicArray[test]);
        else
            System.out.println("Not found. " );

    System.out.println("\n\nSearching for 1987: ");
    selectionYear(musicArray);
    binarySearchYear(musicArray, 1987);

    System.out.println("\n\nSearching for Michael Jackson: ");
    selectionArtist(musicArray);
    binarySearchArtist(musicArray, "Michael Jackson");
    }
    public static void printPlaylist(Music2[] r)
    {
        System.out.println("Song                      Year   Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }

    public static int binarySearchTitle(Music2[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if( r[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if( (low >= 0) && (r[low].getTitle().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    public static void binarySearchArtist(Music2[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getArtist().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( r[probe].getArtist().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (r[low].getArtist().compareTo(toFind) == 0 ))
        {
            linearPrintArtist(r, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    // Prints all elements before and after the found element 
    // that match the search criteria for location.
    public static void linearPrintArtist(Music2[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void binarySearchYear(Music2[] r, int toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getYear() > toFind)
                high = probe;
            else
            {
                low = probe;
                if( r[probe].getYear() == toFind)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (r[low].getYear() == toFind))
        {
            linearPrintYear(r, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }
    
    // Prints all elements before and after the found element 
    // that match the search criteria for location.
    public static void linearPrintYear(Music2[] r, int low, int toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getYear() == toFind))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getYear() == toFind))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    // Sorts Artists using selections sort
    public static void selectionArtist(Music2[] source)
    {
        int i;
        int k;
        int posMax;
        Music2 temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getArtist().compareTo(source[posMax].getArtist()) > 0 )
                    posMax = k;
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
    
        }
    }

    // Sorts titles using selections sort
    public static void selectionTitle(Music2[] source)
    {
        int i;
        int k;
        int posMax;
        Music2 temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getTitle().compareTo(source[posMax].getTitle()) > 0 )
                    posMax = k;
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
    
        }
    }

    // Sorts years using selections sort
    public static void selectionYear(Music2[] source)
    {
        int i;
        int k;
        int posMax;
        Music2 temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getYear() > (source[posMax].getYear()))
                    posMax = k;
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
    
        }
    }
}
