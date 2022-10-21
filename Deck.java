import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
     {}

    public String[] fullDeck()
    {
        Card cd = new Card();
        int aLen = cd.Spades().length;
        int bLen = cd.Hearts().length;
        int cLen = cd.Diamonds().length;
        int dLen = cd.Clubs().length;
        String[] fullDeck = new String[aLen + bLen + cLen + dLen];

        System.arraycopy(cd.Spades(), 0, fullDeck, 0, aLen);
        System.arraycopy(cd.Hearts(), 0, fullDeck, aLen, bLen);
        System.arraycopy(cd.Diamonds(), 0, fullDeck, bLen +aLen, cLen);
        System.arraycopy(cd.Clubs(), 0, fullDeck, cLen + bLen + aLen, dLen);
        return fullDeck;
    }
    
    public String[] shuffledDeck() {
        String[] arr = fullDeck();
        List<String> strList = Arrays.asList(fullDeck());
        Collections.shuffle(strList);
        arr = strList.toArray(new String[strList.size()]);
        return arr;
    }
    
}
