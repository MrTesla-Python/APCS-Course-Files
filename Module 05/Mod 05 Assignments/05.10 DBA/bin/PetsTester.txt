/**
 * The Pets class creates a basic pet object with a name a breed and an age
 * the tester class then utilizes those methods to take user input of information about a pet
 * create a pet object and print it's information to the screen.
 *
 * @author Tristan Darnell
 * @version 07/31/23
 */
import java.util.Scanner;
public class PetsTester
{
public static void main (String [] args)
{
    Scanner in = new Scanner(System.in);
    while (true)
    {
        System.out.print("Enter your pet's name: ");
        String petName = in.nextLine();

        System.out.print("Enter your pet's breed: ");
        String petBreed = in.nextLine();

        System.out.print("Enter your pet's age: ");
        String petAge = in.next();
        in.nextLine();
        int intPetAge = Integer.parseInt(petAge);

        Pets userPet = new Pets(petName, petBreed, intPetAge);
        String name = userPet.getPetName();
        String breed = userPet.getPetBreed();
        int age = userPet.getPetAge();

        System.out.println("Pet's Name: " + name + "\t" + "Pet's Breed: " + breed + "\t" + "Pet's Age: " + age);

        System.out.print("Would you like to enter another pet? (yes/no) ");
        String ans = in.next();
        in.nextLine();
        
        if (ans.equalsIgnoreCase("no"))
        {
            System.out.println("Goodbye and have a great rest of your day! ");
            break;
        }

    }
    in.close();
}
}