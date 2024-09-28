import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NearPalindromesDiv1 {
    public int Solve(String S) {
        int diffaux=1000000;
        int letteri=0;
        int lettern=0;
        int movements=0;

        HashMap<Character, Integer> letterCounter = new HashMap<>();
        List<Character> remainLetters = new ArrayList<>();
        // Search for letters that appear an odd number of times
        for (char letter : S.toCharArray()) {
            letterCounter.put(letter, letterCounter.getOrDefault(letter, 0) + 1);

        }
        // Add letters that appear an odd number of times to a list
        for(char letter:letterCounter.keySet()){
            if(letterCounter.get(letter).intValue()%2!=0){
                remainLetters.add(letter);
            }
        }
        // Loop to go through all the letters
        for (int i = 0; 2 <= remainLetters.size(); i=i) {
            // Loop to compare the letters with the smallest distance between them
            for (int n = 1; n < remainLetters.size(); n++) {

                int diff= Math.abs(remainLetters.get(i)-remainLetters.get(n));
                if(diff>13){
                    diff=26-diff;
                }

                if(diff<diffaux){
                    diffaux=diff;
                    letteri=i;
                    lettern=n;
                }
            }
            if(diffaux!=1000000) {
                movements += diffaux;
            }
            // Remove the letters that have been found with the smallest distance
            remainLetters.remove(remainLetters.get(lettern));
            remainLetters.remove(remainLetters.get(letteri));

            diffaux=1000000;// Reset the auxiliary variable to avoid errors

        }
        return movements;
    }
}
