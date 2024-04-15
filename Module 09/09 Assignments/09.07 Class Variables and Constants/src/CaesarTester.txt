
/**
 * This class creates a program so that users can decrypt and encrypt messages using caesar cipher.
 *
 * @Tristan Darnell
 * @12/26/23
 */
import java.util.*;
public class CaesarTester {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the shift key value (0-25): ");
        int shift = in.nextInt();
        Encryption test = new Encryption(shift);
        in.nextLine();
        System.out.println(Encryption.ALPHABET);
        System.out.println(Encryption.genAlphabet(shift));

        while (true) {
            System.out.print("Enter decrypt or encrypt (type 'quit' to exit): ");
            String userInput = in.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("Thank you, have a good rest of your day!");
                break;
            }
            else if (userInput.equalsIgnoreCase("decrypt"))
            {
                System.out.print("Enter the message you would like to decrypt: ");
                String decrypt = in.nextLine();
                System.out.println(Decryption.decrypt(decrypt));
            }
            else if (userInput.equalsIgnoreCase("encrypt"))
            {
                System.out.print("Enter the message you would like to encrypt: ");
                String encrypt = in.nextLine();
                System.out.println(Encryption.encrypt(encrypt));
            }

            else
            {
                System.out.println("Invalid Input try again");
            }
        }

        in.close();
    }
}
