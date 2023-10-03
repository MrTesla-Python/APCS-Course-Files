 /**
 * Sorts movie objects based on variouse things in descending and ascending order
 *
 * @author Tristan Darnell
 * @version 10/02/23
 */
public class TestMovie {
    public static void main(String[] args)
    {
        Movie[] movies = new Movie[10];
        Movie[] sorted = new Movie [10];

        movies[0] = new Movie("Spider-Man: No Way Home", 2021, "Sony Pictures");
        movies[1] = new Movie("Toy Story 4", 2019, "Disney-Pixar");
        movies[2] = new Movie("Frozen II", 2019, "Disney");
        movies[3] = new Movie("Despicable Me 3", 2017, "Universal Pictures");
        movies[4] = new Movie("Moana", 2016, "Disney");
        movies[5] = new Movie("Zootopia", 2016, "Disney");
        movies[6] = new Movie("Minions", 2015, "Universal Pictures");
        movies[7] = new Movie("Inside Out", 2015, "Disney-Pixar");
        movies[8] = new Movie("Big Hero 6", 2014, "Disney");
        movies[9] = new Movie("Frozen", 2013, "Disney");

        System.out.println("               <<<< Before Sorting >>>> \n");
        for(int i = 0; i < movies.length; i++)
            System.out.println( movies[i] );

        sorted = insertionRelease(movies, 1);

        System.out.println("\n             <<<< After Sorting >>>>");
        System.out.println("<<<< by year in ascending order - passing one array >>>>\n");
        for(int i = 0; i < sorted.length; i++)
            System.out.println(sorted[i] );
        


        sorted = insertionRelease(movies, 2);
        System.out.println("\n             <<<< After Sorting >>>>");
        System.out.println("<<<< by year in descending order - passing one array >>>>\n");
        for(int i = 0; i < sorted.length; i++)
            System.out.println(sorted[i] );

        sorted = insertionName(movies, 1);
        System.out.println("\n             <<<< After Sorting >>>>");
        System.out.println("<<<< by name in ascending order - passing one array >>>>\n");
        for(int i = 0; i < sorted.length; i++)
            System.out.println(sorted[i] );
        


        sorted = insertionName(movies, 2);
        System.out.println("\n             <<<< After Sorting >>>>");
        System.out.println("<<<< by name in descending order - passing one array >>>>\n");
        for(int i = 0; i < sorted.length; i++)
            System.out.println(sorted[i] );

        

        sorted = insertionStudio(movies, 1);
        System.out.println("\n             <<<< After Sorting >>>>");
        System.out.println("<<<< by studio in ascending order - passing one array >>>>\n");
        for(int i = 0; i < sorted.length; i++)
            System.out.println(sorted[i] );
        


        sorted = insertionStudio(movies, 2);
        System.out.println("\n             <<<< After Sorting >>>>");
        System.out.println("<<<< by studio in descending order - passing one array >>>>\n");
        for(int i = 0; i < sorted.length; i++)
            System.out.println(sorted[i] );

    }

    public static Movie[] insertionRelease(Movie[] source, int sort)
    {
        Movie[] dest = new Movie[source.length];
        if (sort == 1)
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getYear() > dest[k-1].getYear() )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }
        else if (sort == 2)
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getYear() < dest[k-1].getYear() )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }
        return dest;
    }

    public static Movie[] insertionName(Movie[] source, int sort)
    {
        Movie[] dest = new Movie[source.length];
        if (sort == 1)
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getTitle().compareTo(dest[k-1].getTitle()) > 0)
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }
        else if (sort == 2)
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getTitle().compareTo(dest[k-1].getTitle()) < 0)
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }
        return dest;
    }

    public static Movie[] insertionStudio(Movie[] source, int sort)
    {
        Movie[] dest = new Movie[source.length];
        if (sort == 1)
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getStudio().compareTo(dest[k-1].getStudio()) > 0)
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }
        else if (sort == 2)
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getStudio().compareTo(dest[k-1].getStudio()) < 0)
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }
        return dest;
    }
}
