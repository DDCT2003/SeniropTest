import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String S = scanner.nextLine();
        NearPalindromesDiv1 Palindromes=new NearPalindromesDiv1();
        int movements= Palindromes.Solve(S);


        //Print the moves
        System.out.println(movements);
    }
}



