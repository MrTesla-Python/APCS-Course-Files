/**
 * Without modifying any of the method signatures, correct add method calls to the already created methods in the main() below 
 *
 * The MakingMethodCalls class calls various methods to perform simple tasks
 *
 * Tristan Darnell
 * 7/23/23
 */ 
 public class MakingMethodCalls

{
    public static void addTheseTwo()
    {
        System.out.println("Ten plus five equals " + (10 + 5));
    }   
    
    public static void multiplyTheseTwo(int a, int b)
    {
        System.out.println("Ten times five equals " + (a * b));
    }  
    
    public static int divideTheseTwo(int a, int b)
    {
        return (a / b);
    }    
    
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;
        
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten plus five equals 15"
         */
        addTheseTwo();



        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten times five equals 50"
         */
        multiplyTheseTwo(10, 5);
        

        
        
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten divided by five equals 2"
         */
        int answer = divideTheseTwo(10, 2);
        System.out.println("Ten divided by two equals " + answer);
        

    }//end of main method
}//end of class
