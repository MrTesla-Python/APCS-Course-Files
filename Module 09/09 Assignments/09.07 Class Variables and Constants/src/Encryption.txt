
/**
 * This class defines an Encryption object.
 *
 * @Tristan Darnell
 * @12/26/23
 */
public class Encryption {
    public static int shift;
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Encryption(int s)
    {
        shift = s;
    }
    public static String genAlphabet(int shift)
    {
        String alpha = "";
        for (int i = 0; i < ALPHABET.length(); i++)
        {
            char ch = (char)(((int)ALPHABET.charAt(i) + shift - 65) % 26 + 65);
            alpha += ch;
        }
        return alpha;
    }
    public static String encrypt(String s)
    {
        String ans = "";
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
            {
                ans += " ";
            }
            else if (Character.isLowerCase(s.charAt(i)))
            {
                char c = (char)(((int)s.charAt(i) + shift - 'a') % 26 + 97);
                ans += c;
            }
            else
            {
                char c = (char)(((int)s.charAt(i) + shift - 'A') % 26 + 65);
                ans += c;
            }
        }
        return ans;
    }
}
