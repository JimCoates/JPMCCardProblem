import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Flushes {

    static final String[] royalFlush = {"A", "K", "Q", "J", "10" };
    ArrayList<String> hand;

    public Flushes(ArrayList<String> hand){
        this.hand = hand;
    }


    public boolean checkFlush(){
        char suit = hand.get(0).charAt(1);
        for (String card: hand) {
            if(card.charAt(1) != suit){
                return false;
            }
        }
        return true;
    }

    public boolean hasRoyalFlush(){
        StringBuilder singleHand = new StringBuilder();
        for (String card:hand) {
            singleHand.append(card);
        }
        String stringHand = singleHand.toString();
        for (String royal:royalFlush) {
            if(stringHand.contains(royal) & checkFlush()){
                return true;
            }
        }
        return false;
    }

    public boolean checkConsecutieCards() {
        Collections.sort(hand);
        for (int i = 0; i < hand.size() - 1; i++) {
            if (Integer.parseInt(String.valueOf(hand.get(i).charAt(0))) + 1 != Integer.parseInt(String.valueOf(hand.get(i + 1).charAt(0)))) {
                return false;
            }
            return true;
        }
    }

    public boolean hasStraightFlush(){
        if(checkFlush() && checkConsecutieCards()){
            return true;
        }
        return false;
    }

}
