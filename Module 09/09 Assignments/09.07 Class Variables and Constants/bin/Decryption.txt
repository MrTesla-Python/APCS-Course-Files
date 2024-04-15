
/**
 * This class defines an decryption object.
 *
 * @Tristan Darnell
 * @12/26/23
 */
public class Decryption {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String genAlphabet()
    {
        String alpha = "";
        for (int i = 0; i < ALPHABET.length(); i++)
        {
            char ch = (char)(((int)ALPHABET.charAt(i) + Encryption.shift - 65) % 26 + 65);
            alpha += ch;
        }
        return alpha;
    }
    public static String decrypt(String s)
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
                char c = (char)(((int)s.charAt(i) - Encryption.shift - 'a' + 26) % 26 + 97);
                ans += c;
            }
            else
            {
                char c = (char)(((int)s.charAt(i) - Encryption.shift - 'A' + 26) % 26 + 65);
                ans += c;
            }
        }
        return ans;
    }
}
