import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double gallons = 0.0, efficiency = 0.0, price = 0.0;
        boolean done = false;
        String trash = "";

        // Input for number of gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a number.");
                done = false;
            }
        } while (!done);

        // Input for fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                efficiency = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a number.");
                done = false;
            }
        } while (!done);

        // Input for price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. Please enter a number.");
                done = false;
            }
        } while (!done);

        // Calculate the cost of driving 100 miles
        double cost = (100 / efficiency) * price;
        // how far the car can go with a full tank of gas
        double distance = gallons * efficiency;
        System.out.println("The cost of driving 100 miles is $" + cost);
        System.out.println("The car can go " + distance + " miles with a full tank of gas.");
    }
}