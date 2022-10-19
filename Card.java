public class Card {

    private int cardNum;
    final static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    final static String[] ranks = {"2", "3","4","5","6","7","8", "9","10", "Jack", "Queen", "King", "Ace"};

    public void Spades() {
        for(int j = 0; j< ranks.length; j++) {
            System.out.println(ranks[j] +" of "+ suits[0]);

        }

    }
    public void Hearts() {
        for(int j = 0; j< ranks.length; j++) {
            System.out.println(ranks[j] +" of "+ suits[1]);

        }

    }
    public void Diamonds() {
        for(int j = 0; j< ranks.length; j++) {
            System.out.println(ranks[j] +" of "+ suits[2]);

        }

    }
    public void Clubs() {
        for(int j = 0; j< ranks.length; j++) {
            System.out.println(ranks[j] +" of "+ suits[3]);

        }

    }

}    
 