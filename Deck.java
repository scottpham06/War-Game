import org.apache.commons.lang.ArrayUtils;
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
    {
        // initialise instance variables
        x = 0;
    }

    
    public String[] fullDeck()
    {
        String[] fullDeck;
        fullDeck = Array.addAll(Card.Spades() + Card.Hearts()+ Card.Diamonds() + Card.Clubs());
        return fullDeck;
    }
}
