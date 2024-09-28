import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input="";
        do {
            System.out.print("Enter the numbers (Max 10): ");
            input = scanner.nextLine();
            if (input.length() > 10) {
                System.out.println("Failed: The number entered has more than 10 digits. Try it again.");
            }
        } while (input.length() > 10);
        // Convert the number into characters array
        char[] charArray = input.toCharArray();

        // Convert characters array into numbers array
        int[] numbers = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            numbers[i] = Character.getNumericValue(charArray[i]);
        }
        BicycleLock lock = new BicycleLock();
        String result = lock.makeDistinct(numbers);
        System.out.println(result);


    }
}