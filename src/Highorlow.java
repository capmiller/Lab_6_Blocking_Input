import java.util.Scanner;

public class Highorlow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = (int) (Math.random() * 10) + 1;
        boolean done = false;
        String trash = "";
        System.out.println("I have a thought of a random number between 1 and 10, inclusive.");

        do {
        System.out.print("Guess the number: ");
        if (in.hasNextInt())
        {
            int guess = in.nextInt();
            if (guess >= 11 || guess <= 0)
            {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                done = false;
            }
            else if (guess == number)
            {
                System.out.println("You guessed the number!");
                done = true;
            }
            else if (guess < number)
            {
                System.out.println("The number is higher.");
                done = false;
            }
            else
            {
                System.out.println("The number is lower.");
                done = false;
            }
        }

        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input. Please enter a number from 1 to 10.");
            done = false;
        }
        } while (!done);
    }
}
