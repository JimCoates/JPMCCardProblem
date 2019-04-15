

import java.util.ArrayList;

public class CardOperations {
    public static Integer getHighCardByValue(ArrayList<String> hand) {
        Integer highValue = 0;

        for (String card : hand) {
            if (Character.getNumericValue(card.charAt(1)) > highValue) {
                highValue = Character.getNumericValue(card.charAt(1));
            }
        }
        return highValue;
    }

    public static ArrayList<String> getFirstHand(String[] handsToSplit) {
        ArrayList<String> firstHand = new ArrayList();
        for (int i = 0; i < 5; i++) {
            firstHand.add(handsToSplit[i]);
        }
        return firstHand;
    }

    public static ArrayList<String> getSecondHand(String[] handsToSplit) {
        ArrayList<String> secondHand = new ArrayList();
        for (int i = 5; i < handsToSplit.length; i++) {
            secondHand.add(handsToSplit[i]);
        }
        return secondHand;
    }

    public static ArrayList<String> getPairs(ArrayList<String> hand) {
        ArrayList<String> pairs = new ArrayList<String>();
        for (int i = 0; i < hand.size(); i++) {
            for (int j = i + 1; j < hand.size(); j++) {
                if (hand.get(i).equals(hand.get(j))) {
                    pairs.add(hand.get(i));
                }
            }
        }
        return pairs;
    }

    public static String checkFor3Or4OfAKind(ArrayList<String> handOnePairs, ArrayList<String> handTwoPairs) {
        if(!(getCountOfSameCards(handOnePairs) >= 3) && !(getCountOfSameCards(handOnePairs) >= 3)){
            return null;
        } else if(getCountOfSameCards(handOnePairs) > getCountOfSameCards(handTwoPairs)){
            return "Left";
        } else return "Right";
    }

    public static Integer getCountOfSameCards(ArrayList<String> handToCountPairs) {
        Integer counter = 0;
        String cardToCheckHandOne = handToCountPairs.get(0);
        for (int i = 1; i < handToCountPairs.size(); i++) {
            if (handToCountPairs.get(i).equals(cardToCheckHandOne)) {
                counter++;
            }

        }
        return counter;
    }
}
