/**
 * This program tests out the CheeseCake class and prints it in a nice format
 *
 * @Tristan Darnell
 * @9/4/23
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            // add CheeseCake to the ArrayList
            CheeseCakeV1 blueberry = new CheeseCakeV1("Blueberry", 5);
            CheeseCakeV1 strawberry = new CheeseCakeV1("Strawberry", 6);
            CheeseCakeV1 cherry = new CheeseCakeV1("Cherry", 4);
            CheeseCakeV1 jalepeno = new CheeseCakeV1("Jalepeno", 1);
            CheeseCakeV1 dill_pickle = new CheeseCakeV1("Dill Pickle", 2);
            CheeseCakeV1 fig = new CheeseCakeV1("Fig", 3);

            cake.add(blueberry);
            cake.add(strawberry);
            cake.add(cherry);
            cake.add(jalepeno);
            cake.add(dill_pickle);
            cake.add(fig);
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcCreamCheese();
            dataRecord.calcSugar();
            dataRecord.calcTotalServings();
            dataRecord.calcVanilla();
        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            dataRecord = cake.get(index);
            System.out.printf("%s %3d %3s", "|", index, "|");
            System.out.println(dataRecord.toString());
        }
    }
}
