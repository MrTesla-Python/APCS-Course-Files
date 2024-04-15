/**
 * Sorts store objects
 *
 * @author Tristan Darnell
 * @version 03/04/24
 */
public class TestStoreV2 {
    public static void main(String[] args) {
        StoreV2[] inventory = {
            new StoreV2("Chewbacca Mask", 1281, 19.99, 24),
            new StoreV2("Harry Potter Wand", 2485, 15.49, 36),
            new StoreV2("Rubik's Cube", 3698, 11.99, 48),
            new StoreV2("LED Desk Lamp", 4721, 29.99, 12),
            new StoreV2("Wireless Earbuds", 5947, 49.99, 20),
            new StoreV2("Reusable Water Bottle", 6752, 12.99, 60),
            new StoreV2("Laptop Backpack", 7314, 39.99, 18),
            new StoreV2("Graphic T-Shirt", 8256, 17.99, 30),
            new StoreV2("Desk Organizer Set", 9138, 24.99, 15),
            new StoreV2("Yoga Mat", 1085, 21.99, 25)
        };
        
        printInventory(inventory);

        selectionSortPrice(inventory, true);
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by product price in ascending order >>>>\n");
        printInventory(inventory);

        mergeSortProductName(inventory, 0, inventory.length-1);
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by product name in ascending order >>>>\n");
        printInventory(inventory);

        insertionSortID(inventory, true);
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by product id in ascending order >>>>\n");
        printInventory(inventory);

        insertionSortID(inventory, false);
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by product id in descending order >>>>\n");
        printInventory(inventory);

        mergeSortProductQuantity(inventory, 0, inventory.length-1);
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by product quantity in ascending order >>>>\n");
        printInventory(inventory);

    }

    private static void printInventory(StoreV2[] inventory) {
        for (StoreV2 item : inventory) {
            System.out.println(item);
        }
    }

    public static void selectionSortPrice(StoreV2[] array, boolean ascending) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((ascending && array[j].getPrice() < array[i].getPrice())
                        || (!ascending && array[j].getPrice() > array[i].getPrice())) {
                            StoreV2 temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                }
            }
        }
    }


     public static void mergeSortProductName(StoreV2[] a, int low, int high)
     {
         if( low == high )
             return;
 
         int mid = ( low + high ) / 2;
 
         mergeSortProductName( a, low, mid );       // recursive call
         mergeSortProductName( a, mid + 1, high);   // recursive call
        
         mergeProductName( a, low, mid, high);
     }

    public static void mergeProductName( StoreV2[] a, int low, int mid, int high )
     {
         StoreV2[] temp = new StoreV2[ high - low + 1 ];
 
         int i = low, j = mid + 1, n = 0;
 
         while( i <= mid || j <= high )
         {
             if( i > mid )
             {
                 temp[ n ] = a[ j ];
                 j++;
             }
             else if( j > high )
             {
                 temp[ n ] = a[ i ];
                 i++;
             }
             else if( a[ i ].getItemName().compareTo(a[ j ].getItemName()) < 0 )
             {
                 temp[ n ] = a[ i ];
                 i++;
             }
             else
             {
                 temp[ n ] = a[ j ];
                 j++;
             }
             n++;
         }
 
         for( int k = low ; k <= high ; k++ )
             a[ k ] = temp[ k - low ];
     }

     public static void insertionSortID(StoreV2[] array, boolean ascending) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            StoreV2 key = array[i];
            int j = i - 1;

           
            while (j >= 0 && ((ascending && array[j].getProductNumber() > key.getProductNumber()) ||
                              (!ascending && array[j].getProductNumber() < key.getProductNumber()))) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void mergeSortProductQuantity(StoreV2[] a, int low, int high)
     {
         if( low == high )
             return;
 
         int mid = ( low + high ) / 2;
 
         mergeSortProductQuantity( a, low, mid );       // recursive call
         mergeSortProductQuantity( a, mid + 1, high);   // recursive call     
         mergeProductQuantity( a, low, mid, high);
     }

    public static void mergeProductQuantity( StoreV2[] a, int low, int mid, int high )
     {
         StoreV2[] temp = new StoreV2[ high - low + 1 ];
 
         int i = low, j = mid + 1, n = 0;
 
         while( i <= mid || j <= high )
         {
             if( i > mid )
             {
                 temp[ n ] = a[ j ];
                 j++;
             }
             else if( j > high )
             {
                 temp[ n ] = a[ i ];
                 i++;
             }
             else if( a[ i ].getQuantity() < a[ j ].getQuantity() )
             {
                 temp[ n ] = a[ i ];
                 i++;
             }
             else
             {
                 temp[ n ] = a[ j ];
                 j++;
             }
             n++;
         }
 
         for( int k = low ; k <= high ; k++ )
             a[ k ] = temp[ k - low ];
     }
     
}
