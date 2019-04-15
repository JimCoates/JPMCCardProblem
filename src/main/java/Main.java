

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {

    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        line = in.readLine();

        String[] hands = line.split(" ");

        ArrayList<String> handOne = CardOperations.getFirstHand(hands);
        ArrayList<String> handTwo = CardOperations.getSecondHand(hands);

        System.out.println(CardOutcomes.determineWinnerByHighCard(handOne, handTwo));
    }
}

