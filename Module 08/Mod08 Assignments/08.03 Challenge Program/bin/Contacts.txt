
/**
 * Purpose: To create a contact object
 *
 * @Tristan Darnell
 * @11/19/23
 *
 */
public class Contacts
{
    // instance variables
    private String name;
    private String relationMe;
    private String birthday;
    private String phoneNumber;
    private String email;

    // Constructor for objects of class Music
    public Contacts(String n, String r, String b, String p, String e)
    {
        // initialize instance variables
        name = n;
        relationMe = r;
        birthday = b;
        phoneNumber = p;
        email = e;
    }

    public String getName()
    {
        return name;
    }
   
    public void setName(String n)
    {
        name = n;
    }
   
    public String getRelationMe()
    {
        return relationMe;
    }
    
    public void setRelationMe(String r)
    {
        relationMe = r;
    }
   
    public String getBirthday()
    {
        return birthday;
    }
    
    public void setBirthday(String b)
    {
        birthday = b;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String p)
    {
        phoneNumber = p;
    }

    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String e)
    {
        birthday = e;
    }
   
    public String toString()
    {
        String str = String.format("%-20s %-13s         %-6s              %-12s         %-25s", name, relationMe, birthday, phoneNumber, email);

        return str;
    }
}