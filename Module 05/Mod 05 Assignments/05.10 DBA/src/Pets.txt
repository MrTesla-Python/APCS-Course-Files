/**
 * The Pets class creates a basic pet object with a name a breed and an age
 * the tester class then utilizes those methods to take user input of information about a pet
 * create a pet object and print it's information to the screen.
 *
 * @author Tristan Darnell
 * @version 07/31/23
 */
public class Pets
{
    //declare instance variables for pet name, pet breed and pet age
    private String myPetName = null;
    private String myPetBreed = null;
    private int myPetAge;
    //create the default constructor
    public Pets()
    {

    }
    //create the constructor with parameters
    public Pets(String petName, String petBreed, int petAge)
    {
      myPetName = petName;
      myPetBreed = petBreed;
      myPetAge = petAge;
    }
    //setter & getter methods for petName, petBreed and petAge

    public String getPetName()
    {
      return myPetName;
    }

    public String getPetBreed()
    {
      return myPetBreed;
    }

    public int getPetAge()
    {
      return myPetAge;
    }

    public void setPetName(String petName)
    {
      myPetName = petName;
    }

    public void setPetBreed(String petBreed)
    {
      myPetBreed = petBreed;
    }

    public void setPetAge(int petAge)
    {
      myPetAge = petAge;
    }
}