public class Main {
    public static void main(String[] args) {
        int x=1;
        // Loop to go through numbers from 1 to 100
        while(x<=100) {
            // Check if 'x' is divisible by both 3 and 5
            if(x % 3==0 && x % 5==0) {
                System.out.println("senirop");
            }
            // Check if 'x' is divisible only by 3
            else if(x % 3==0) {
                System.out.println("senir");
            }
            // Check if 'x' is divisible only by 5
            else if (x % 5==0) {
                System.out.println("op");
            }
            // If 'x' is not divisible by 3 or 5, print the number itself
            else {
                System.out.println(x);
            }
            // Increment 'x' to move to the next number
            x++;
        }

    }
}