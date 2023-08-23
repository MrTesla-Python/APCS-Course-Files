/**
 * A program that creates a class with two methods
 * one sees if a word is withing an array
 * and the other compares numWords and length
 * of array and makes sure they are equal
 * both return booleans
 *
 * @Tristan Darnell
 * @8/22/23
 */

public class WordTester
{
// instance variable myWords contains an array of String values
//storing the words from the phrase - where each element is a
//single word.
// The instance variable myNumWords acts as a check digit to confirm
// the number of words found in the phrase.
// The instance variable myTargetWord contains a target word is to
//be located in the array
// The constructor accepts a String array with the words, an int
// representing the number of words in the phrase and a String
// representing the target word.
// There may be other instance variables, constructors and methods
// not shown
    private String [] myWords;
    private int myNumWords;
    private String myTargetWord;
    public WordTester(String [] words, int numWords, String targetWord)
    {

    myWords = words;
    myNumWords = numWords;
    myTargetWord = targetWord;

    }
    public boolean isWithin()
    {
        for (int i = 0; i < myWords.length; i++)
        {
            if (myWords[i].equals(myTargetWord))
            {
                return true;
            }
        }
        return false;
    }
    public boolean sameNumber()
    {
        if (myWords.length == myNumWords) return true;
        return false;
    } 
}