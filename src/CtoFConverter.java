import java.util.Scanner;


public class CtoFConverter {
    public static void main(String[] args)
    {
        System.out.println("Enter the temperature in Celsius: ");
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";


        while (!done)
        {
            if (in.hasNextDouble())
            {
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.print("Invalid input. Please enter a number: ");

            }
        }
        double celsius = in.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

    }
}
