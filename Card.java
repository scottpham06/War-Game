public class Card {

    private int cardNum;
    final static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    final static String[] ranks = {"2", "3","4","5","6","7","8", "9","10", "Jack", "Queen", "King", "Ace"};

    public static String[] Spades() {
        String[] arr = new String[ranks.length];
        for(int j = 0; j< ranks.length; j++) {
            arr[j] = (ranks[j] +" of "+ suits[0]);

        }
        
        return arr;
    }
     public static String[] Hearts() {
        String[] arr = new String[ranks.length];
        for(int j = 0; j< ranks.length; j++) {
            arr[j] = (ranks[j] +" of "+ suits[1]);

        }
        
        return arr;
    }
     public static String[] Diamonds() {
        String[] arr = new String[ranks.length];
        for(int j = 0; j< ranks.length; j++) {
            arr[j] = (ranks[j] +" of "+ suits[2]);

        }
        
        return arr;
    }
     public static String[] Clubs() {
        String[] arr = new String[ranks.length];
        for(int j = 0; j< ranks.length; j++) {
            arr[j] = (ranks[j] +" of "+ suits[3]);

        }
        
        return arr;
    }

}    
 