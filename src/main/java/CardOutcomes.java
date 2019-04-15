import java.util.ArrayList;

public class CardOutcomes {
    public static String determineWinnerByHighCard(ArrayList<String> handOne, ArrayList<String> handTwo) {

        Integer handOneHigh = CardOperations.getHighCardByValue(handOne);
        Integer handTwoHigh = CardOperations.getHighCardByValue(handTwo);
        if (handOneHigh > handTwoHigh) {
            return "left";
        } else {
            return "right";
        }
    }

    public static String determineWinner3Kind4Kind1Pair2Pair(ArrayList<String> handOne, ArrayList<String> handTwo) {
        ArrayList<String> handOnePairs = CardOperations.getPairs(handOne);
        ArrayList<String> handTwoPairs = CardOperations.getPairs(handTwo);

        if(!(CardOperations.checkFor3Or4OfAKind(handOnePairs, handTwoPairs) == null)){
            return CardOperations.checkFor3Or4OfAKind(handOnePairs, handTwoPairs);
        }

        if(handOnePairs.size() > handTwoPairs.size()){
            return "Left";
        } else if(handTwoPairs.size() > handOnePairs.size()){
            return "Right";
        } else {
            return determineWinnerByHighCard(handOne, handTwo);
        }
    }


}
