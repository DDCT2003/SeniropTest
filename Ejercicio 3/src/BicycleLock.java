import java.util.HashSet;

public class BicycleLock {

    public String makeDistinct(int[] dials) {
        StringBuilder moves = new StringBuilder();
        HashSet<Integer> repeated = new HashSet<>();
        int position = 0;

        // Traverse all the dials.
        while (position < dials.length) {
            // If the current number is repeated, we need to change it.
            while (repeated.contains(dials[position])) {
                dials[position] = (dials[position] + 1) % 10; // Increment the current digit.
                moves.append("+"); // Register the move.
            }
            // Add the current number to the set of already seen numbers.
            repeated.add(dials[position]);

            // Move the position to the next dial if we're not at the last one.
            if (position < dials.length - 1) {
                moves.append(">");
                position++;
            } else {
                break; // If we're at the last dial, exit.
            }
        }

        return moves.toString(); // Return the sequence of moves.
    }
}
