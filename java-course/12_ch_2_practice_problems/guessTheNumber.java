import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 45;
        System.out.println("Enter a number: ");
        int guess = sc.nextInt();
        if (guess > number) {
            System.out.println("Your number is too high");
        }
        else if (guess < number) {
            System.out.println("Your number is too low");
        }
        else {
            System.out.println("Your number is correct");
        }
        sc.close();


    }
}
