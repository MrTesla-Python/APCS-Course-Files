/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 * The second half of the program calculates how much of an item 
 * a person can buy with a specified budget
 *
 * @author Tristan Darnell
 * @version 07/19/23
 */
public class CurrencyV2
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 16.75824;     // 1 US dollar = 16.75824 Pesos
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;      // US dollars spent in Mexico
        double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;        // US dollars remaining after Mexico
        //remaining variables below here

        // United Kingdom
        double poundsSpent = 2543.54;
        double poundExchangeRate = 0.770738;
        double dollarsSpentInUnitedKingdom = poundsSpent / poundExchangeRate;
        double dollarsAfterUnitedKingdom = dollarsAfterMexico - dollarsSpentInUnitedKingdom;

        // Japan
        double yensSpent = 131420.58;
        double yenExchangeRate = 139.0926;
        double dollarsSpentInJapan = yensSpent / yenExchangeRate;
        double dollarsAfterJapan = dollarsAfterUnitedKingdom - dollarsSpentInJapan;

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here

        System.out.println("Starting US dollars:                " + startingUsDollars);
        System.out.println();

        System.out.println("Mexico:");
        System.out.println("\tPesos Spent:                 " + pesosSpent);
        System.out.println("\tUS dollars equivalent:       " + dollarsSpentInMexico);
        System.out.println("\tUS dollars remaining:        " + dollarsAfterMexico);

        System.out.println();

        System.out.println("United Kingdom:");
        System.out.println("\tPounds Spent:                " + poundsSpent);
        System.out.println("\tUS dollars equivalent:       " + dollarsSpentInUnitedKingdom);
        System.out.println("\tUS dollars remaining:        " + dollarsAfterUnitedKingdom);

        System.out.println();

        System.out.println("Japan:");
        System.out.println("\tYen Spent:                   " + yensSpent);
        System.out.println("\tUS dollars equivalent:       " + dollarsSpentInJapan);
        System.out.println("\tUS dollars remaining:        " + dollarsAfterJapan);

        System.out.println("=============================================================");
        
        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = budget1 / costItem1; 		//how many items can be purchased
		int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int) (budget2 / costItem2); ; 	//how many items can be purchased
		double fundsRemaining2 = budget2 % costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

